package com.controller.Q17;

public class CheckingAmount {
	public int amount;

	public CheckingAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void changeAmount(int x) {
		amount += x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAmount acct = new CheckingAmount((int) (Math.random() * 1000));
		//insert here and check
		System.out.println(acct.getAmount());
	}

}
