package com.weather.service;

import com.weather.externalservice.WeatherClient;
import com.weather.model.Weather;
import com.weather.exception.WeatherException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Value("${weather.url}")
    private String weatherUrl;

    @Value("${weather.xRapidApiKey}")
    private String xRapidApiKey;

    @Value("${weather.xRapidApiHost}")
    private String xRapidApiHost;

    private WeatherClient weatherClient;

    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public Weather getWeatherDetails(String aggregateHours, String location, String contentType, String unitGroup, Boolean shortColumnNames){
        Weather weather = weatherClient.getWeather(xRapidApiKey,
                xRapidApiHost, aggregateHours, location,
                contentType, unitGroup, shortColumnNames);
        if (weather == null || weather.getLocations()==null) {
           throw  new WeatherException(HttpStatus.NOT_FOUND,"weather for the location "+location+" doesn't exist");
        }
        return weather;
    }

    }

