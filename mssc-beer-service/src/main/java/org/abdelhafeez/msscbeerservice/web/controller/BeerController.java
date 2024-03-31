package org.abdelhafeez.msscbeerservice.web.controller;

import java.util.UUID;

import org.abdelhafeez.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    // TODO: inject service

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        // TODO: use service
        return new ResponseEntity<BeerDto>(BeerDto.builder().id(beerId).build(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Void> saveNewBeer(@RequestBody BeerDto dto) {
        // TODO: use service
        HttpHeaders headers = new HttpHeaders();
        // TODO: get real id from saved entity & use it in Location header
        headers.add("Location", "api/v1/beer" + UUID.randomUUID().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto dto) {
        // TODO: use service
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
