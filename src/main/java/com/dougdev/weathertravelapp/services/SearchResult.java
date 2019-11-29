package com.dougdev.weathertravelapp.services;

import com.dougdev.weathertravelapp.dtos.FlightSearchDto;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class SearchResult {
    private FlightSearchDto flightSearchDto = new FlightSearchDto();

    private String searchUriLink = "test.com";


    public ResponseEntity<FlightSearchDto[]> results(@RequestBody String requestBody) {
        Mapper mapper = new DozerBeanMapper();

        mapper.map(requestBody, flightSearchDto);

        return searchFlights(flightSearchDto);
    }

    public ResponseEntity<FlightSearchDto[]> searchFlights(FlightSearchDto flightSearchDto) {
        HttpEntity<FlightSearchDto> request = new HttpEntity<>(flightSearchDto);

        URI searchURI = UriComponentsBuilder.fromUriString(searchUriLink)
                .build()
                .encode()
                .toUri();

        return new RestTemplate().exchange(searchURI, HttpMethod.GET, request, FlightSearchDto[].class);
    }
}
