package com.weather.controller;

import com.weather.exception.ErrorResponse;
import com.weather.model.UnitGroup;
import com.weather.model.Weather;
import com.weather.service.WeatherService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    private static final String LOG_PREFIX = "Weather Controller";
    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherController.class);
    private final WeatherService weatherService;
    @Value("${weather.contentType}")
    private String contentType;
    private  static final String weatherServiceName="weatherService";


    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Operation(summary = "Get weather details by location")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found weather details",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Weather.class))}),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))}),
            @ApiResponse(responseCode = "404", description = "Weather not found",
                    content = {@Content(mediaType = "application/json")})})
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @CircuitBreaker(name = weatherServiceName, fallbackMethod = "weatherServiceFallBack")
    @Retry(name = weatherServiceName)
    @RateLimiter(name = weatherServiceName)
    public ResponseEntity<Weather> getWeatherDetailsFeign(@RequestParam(value = "aggregateHours",required = true) String aggregateHours, @RequestParam(value = "location",required = true) String location,
                                                          @RequestParam(value = "unitGroup",required = true) UnitGroup unitGroup, @RequestParam(value = "shortColumnNames",required = true)Boolean shortColumnNames)  {
        LOGGER.info("{} Get weather of location:{} over {} hours", LOG_PREFIX, location,aggregateHours);
        Weather weatherDetailsFeign = weatherService.getWeatherDetails(aggregateHours,location,contentType,unitGroup.getType(),shortColumnNames);

        return new ResponseEntity<>(weatherDetailsFeign,HttpStatus.OK);
    }

    public ResponseEntity<Weather> weatherServiceFallBack(Exception e) {
        return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
    }

}
