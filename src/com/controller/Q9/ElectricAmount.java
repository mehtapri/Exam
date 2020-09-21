package com.controller.Q9;

class Customer {
	ElectricAmount acct = new ElectricAmount();

	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}
}

public class ElectricAmount {
	private double kWh;
	private double rate = 0.07;
	private double bill;

	public void addKWh(double kWh) {
		this.kWh += kWh;
		this.bill = this.kWh * this.rate;

	}

	public static void main(String[] args) {

	}

}
