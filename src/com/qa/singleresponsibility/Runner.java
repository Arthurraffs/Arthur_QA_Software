package com.qa.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		Car bmw = new Car("RED", "BMW", 50000);
		Driver eoin = new Driver();
		Mechanic john = new Mechanic();
		
		eoin.drive(250);
		john.fix(true);
		
		System.out.println(eoin.getMileage());
		System.out.println(bmw);
		System.out.println(john.isServiceDue());
		
	}

}
