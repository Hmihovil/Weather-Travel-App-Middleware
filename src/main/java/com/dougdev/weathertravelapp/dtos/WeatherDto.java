package com.dougdev.weathertravelapp.dtos;

import lombok.Data;

/**
 * TODO: Add validator later. So that weatherType is within scope. EI: sunny, rainy, cloudy, etc..
 */

@Data
public class WeatherDto {
    private String weatherType;
    private Integer temperature;
}

