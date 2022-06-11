package com.institute.fundtransfer.credit.pay;

public class moneytransfer {
    private int id;
	
	private double money;
	
	private String sender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "FundsTransferRequest [id=" + id + ", money=" + money + ", sender=" + sender + "]";
	}

}
