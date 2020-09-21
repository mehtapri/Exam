package com.controller.Q25;

public class Employee {
	String name;
	boolean contract;
	double salary;
	Employee(){
		//line1 //make changes below if needed
		this.name=new String("Joe");
		this.contract= new Boolean(true);
		this.salary= new Double(100);
		
	}
	public String toString() {
		return name+":"+contract+":"+salary;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee();
//line2 //make changes below if needed
e.name ="Joe";
e.contract=true;
e.salary=100;
System.out.print(e);
	}

}
