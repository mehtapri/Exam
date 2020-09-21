package com.controller.Q38;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double discount =0;
		int qty = Integer.parseInt(args[0]);
		
		//write codes below and check
		if(qty>80 && qty<90) {
			discount =0.2;
		}else {
			discount =0;
		}
		if(qty>=90) {
			discount=0.5;
		}else {
			discount=0;
		}
	
	}

}
