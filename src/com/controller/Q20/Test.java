package com.controller.Q20;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		while(isAvailable(x)) {
			System.out.print(x);
			x--;
		}

	}
	public static boolean isAvailable(int x) {
		return x-->0?true:false;
	}

}
