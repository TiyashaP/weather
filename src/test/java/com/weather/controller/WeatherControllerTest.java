package com.weather.controller;

import com.weather.model.UnitGroup;
import com.weather.model.Weather;
import com.weather.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes = {WeatherController.class})
@ExtendWith(SpringExtension.class)
class WeatherControllerTest {
    @Autowired
    private WeatherController weatherController;

    @MockBean
    private WeatherService weatherService;

    @Test
    void testGetWeatherDetailsFeign() throws Exception {
        String[] values = new String[]{"24"};
        String[] values1 = new String[]{"London"};
        Mockito.when(weatherService.
                        getWeatherDetails("24","London","json","us",true)).thenReturn(new Weather());
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/v1/weather/")
                .param("aggregateHours", values)
                .param("location", values1);
        String[] values2 = new String[]{String.valueOf(true)};
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("shortColumnNames", values2);
        String[] values3 = new String[]{String.valueOf(UnitGroup.us)};
        MockHttpServletRequestBuilder requestBuilder = paramResult1.param("unitGroup", values3);
        Object[] controllers = new Object[]{weatherController};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();
        buildResult.perform(requestBuilder).andExpect(status().isOk());
    }

    @Test
    void testGetWeatherDetailsFeignException() throws Exception {
        String[] values = new String[]{"24"};
        String[] values1 = new String[]{"London"};
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/v1/weather/")
                .param("aggregateHours", values)
                .param("location", values1);
        String[] values2 = new String[]{String.valueOf(true)};
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("shortColumnNames", values2);
        String[] values3 = new String[]{String.valueOf("abcd")};
        MockHttpServletRequestBuilder requestBuilder = paramResult1.param("unitGroup", values3);
        Object[] controllers = new Object[]{weatherController};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();
        buildResult.perform(requestBuilder).andExpect(status().is4xxClientError());
    }
}

