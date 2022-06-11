package com.institute.fundtransfer.FundTransfering.dataTransfer;

import com.institute.fundtransfer.FundTransfering.dataTransfer.Base;


public class ServiceReq extends Base {
    private String sources;
	
	private String desinations;
	
	private String id;

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getDestinations() {
		return destinations;
	}

	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
