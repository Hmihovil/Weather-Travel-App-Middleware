package com.dougdev.weathertravelapp.dtos;

import lombok.Data;

@Data
public class FlightSearchDto {
    FlightDto flights;
    WeatherDto weather;
}
