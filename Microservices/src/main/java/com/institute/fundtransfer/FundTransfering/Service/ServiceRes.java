package com.institute.fundtransfer.FundTransfering.dataTransfer;

import com.institute.fundtransfer.FundTransfering.dataTransfer.Base;

public class ServiceRes extends Base{
    private String id;
	
	private float rate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
