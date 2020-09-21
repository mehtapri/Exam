package com.controller.Q7;

class Vehicle{
	
	String type="4W";
	int maxSpeed = 100;
	
	Vehicle(String type,int maxSpeed){
		this.type= type;
		this.maxSpeed=maxSpeed;
	}
}
class Car extends Vehicle{
	String trans;
	
	Car(String trans){
		this.trans = trans;
	}
	
	Car(String type,int maxSpeed,String trans){
		super(type,maxSpeed);
		this(trans);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W",150,"Manual");
		System.out.println(c1.type+""+c1.maxSpeed+""+c1.trans);
		System.out.println(c2.type+""+c2.maxSpeed+""+c2.trans);

	}

}
