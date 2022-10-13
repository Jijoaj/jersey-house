package com.jijo.jerseyhouse.controller.impl;

import com.jijo.jerseyhouse.controller.MainControllerInterface;
import com.jijo.jerseyhouse.model.Country;
import com.jijo.jerseyhouse.model.League;
import com.jijo.jerseyhouse.service.DeliveryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController implements MainControllerInterface {

    @Autowired
    DeliveryServiceInterface deliveryService;

    @Override
    public ResponseEntity<String> connect() {
        return new ResponseEntity<>("Successfully connected to Jersey house !",HttpStatus.OK);
    }

    /**
     * method getCountryList
     * @return List of countries
     */
    @Override
    public ResponseEntity<List<Country>> getCountryList() {
        return new ResponseEntity<>(deliveryService.getCountryList(),HttpStatus.OK);
    }

    /**
     * @param country
     * @return list of league available in the country
     */
    @Override
    public ResponseEntity<List<League>> getLeagueByCountry(String country) {
        return new ResponseEntity<>(deliveryService.getLeagueByCountry(country),HttpStatus.OK);
    }
}
