package com.dougdev.weathertravelapp.dtos;

import lombok.Data;

@Data
public class FlightDto {
    private String origin;
    private String destination;
    private Float price;
}
