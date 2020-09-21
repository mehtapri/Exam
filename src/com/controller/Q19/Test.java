package com.controller.Q19;

public class Test {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Cardd");
	}

	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ex = new Test();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		ex.readCard(cardNo);
	}

}
