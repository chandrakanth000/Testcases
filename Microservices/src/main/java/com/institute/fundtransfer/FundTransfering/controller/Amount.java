package com.institute.fundstransfer.FundTransfering.controller;

import java.util.UUID;

@RestController
@RequestMapping("api")
public class Amount {
    @PostMapping(value="/payment",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentResponse> doPayments(@RequestBody PaymentRequest req ){
		
		PaymentResponse response =  new PaymentResponse();
		res.setStatus(true);
		res.setTxnRefNumber(UUID.randomUUID().toString());
		
		return new ResponseEntity<PaymentResponse>(response, HttpStatus.OK);
	}
	
	
	
}
