package com.weather.service;

import com.weather.exception.WeatherException;
import com.weather.externalservice.WeatherClient;
import com.weather.model.Locations;
import com.weather.model.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


class WeatherServiceTest {

    @InjectMocks
    private WeatherService weatherService;

    @Mock
    private WeatherClient weatherClient;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(weatherService, "xRapidApiKey", "rapidApiKey");
        ReflectionTestUtils.setField(weatherService, "xRapidApiHost", "rapidApiHost");
    }





    @Test
    @DisplayName("should throw exception when weather not found")
    void testGetWeatherDetails3() {
        when(weatherClient.getWeather("rapidApiKey","rapidApiHost","Aggregate Hours", "Location", "text/plain", "Unit Group", true)).thenReturn(null);
        assertThrows(WeatherException.class,
                () -> weatherService.getWeatherDetails("Aggregate Hours", "Location", "text/plain", "Unit Group", true));
        verify(weatherClient).getWeather((String) any(), (String) any(), (String) any(), (String) any(), (String) any(),
                (String) any(), (Boolean) any());
    }


    @Test
    @DisplayName("success when location found")
    void testGetWeatherDetails4() {
        Weather weather = mock(Weather.class);
        when(weather.getLocations()).thenReturn(new Locations());
        when(weatherClient.getWeather("rapidApiKey","rapidApiHost","Aggregate Hours", "Location", "text/plain", "Unit Group", true)).thenReturn(weather);
        weatherService.getWeatherDetails("Aggregate Hours", "Location", "text/plain", "Unit Group", true);
        verify(weatherClient).getWeather("rapidApiKey","rapidApiHost","Aggregate Hours", "Location", "text/plain", "Unit Group", true);
        verify(weather).getLocations();
    }


    @Test
    @DisplayName("should throw exception when location not found")
    void testGetWeatherDetailsLocationNotFound() {
        Weather weather = mock(Weather.class);
        when(weather.getLocations()).thenThrow(new WeatherException(HttpStatus.CONTINUE, "An error occurred"));
        when(weatherClient.getWeather("rapidApiKey","rapidApiHost",null, "Location", "text/plain", "Unit Group", true)).thenReturn(weather);
        assertThrows(WeatherException.class,
                () -> weatherService.getWeatherDetails(null, "Location", "text/plain", "Unit Group", true));
        verify(weatherClient).getWeather((String) any(), (String) any(), (String) any(), (String) any(), (String) any(),
                (String) any(), (Boolean) any());
        verify(weather).getLocations();
    }

    @Test
    @DisplayName("should throw exception when weather not found")
    void testGetWeatherDetailsNotFound() {
        when(weatherClient.getWeather("rapidApiKey", "rapidApiHost", "aggregateHours", "location", "json",
                "unitGroup", false)).thenReturn(new Weather());
        assertThrows(WeatherException.class, () -> weatherService.getWeatherDetails(
                "aggregateHours", "location", "json",
                "unitGroup", false));
    }
}
