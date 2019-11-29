package com.dougdev.weathertravelapp.controller;

import com.dougdev.weathertravelapp.dtos.FlightSearchDto;
import com.dougdev.weathertravelapp.services.SearchResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Search {
    @GetMapping(value = "/flights}", produces = "application/json")
    public ResponseEntity<FlightSearchDto[]> returnedSearch(@RequestBody String requestBody) {
        return new SearchResult().results(requestBody);
    }
}
