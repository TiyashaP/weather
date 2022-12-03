package com.weather.externalservice;

import com.weather.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="weather-api",url = "${weather.url}")
public interface WeatherClient {
    @RequestMapping(method = RequestMethod.GET)
    Weather getWeather(
                       @RequestHeader("X-RapidAPI-Key") String xRapidApiKey,
                       @RequestHeader("X-RapidAPI-Host") String xRapidApiHost,
                       @RequestParam(value="aggregateHours") String aggregateHours,
                       @RequestParam(value="location") String location, @RequestParam(value="contentType") String contentType,
                       @RequestParam(value="unitGroup") String unitGroup,
                       @RequestParam(value="shortColumnNames") Boolean shortColumnNames);
}
