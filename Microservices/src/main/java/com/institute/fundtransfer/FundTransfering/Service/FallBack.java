package com.institute.fundtransfer.FundTransfering.service;

public class FallBack {
    public ServiceRes getForxRates(ServiceReq SReq) {
		
		
		ServiceRes responce =  new ServiceRes();
		
		responce.setRate(0);
		response.setReqId(SReq.getReqId());
		
		return responce;
	}

}
