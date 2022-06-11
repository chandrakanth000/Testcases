package com.institute.fundtransfer.FundTransfering.dataTransfer;

import java.util.Date;

public class Req extends Base{
    private String source;
	private String destination;
	
	private int amount;
	
	private String currency;
	
	@JsonFormat(pattern="yyyyy-mm-dd")
	private Date dt;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

}
