package com.institute.fundtransfer.forex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.institute.fundtransfer.datatransfer.Forexreq;
import com.institute.fundtransfer.datatransfer.Forexres;
import com.institute.fundtransfer.service.Forexapp;


@RestController
@RequestMapping("api")
public class Forex {

    @Autowired
	private Forexapp forexapp;
	
	
	@PostMapping(value="/fx", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Forexres> getForexRates(@RequestBody Forexreq req){
		Forexres rs =  forexapp.getRates(req);
		
		return new ResponseEntity<Forexres>(rs, HttpStatus.OK);
		
	}
}
    

