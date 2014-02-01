package org.ruff.example.java.operators;

public class InstanceOfExample {
	
	public static void main(String[] args) {
		
		/*
		 * instanceOf check 3 things
		 * extends, implements, same type
		 */

		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		MotorCycle moto = new MotorCycle();

		// Those will evaluate to true
		System.out.println("vehicle instanceof Vehicle: "
				+ (vehicle instanceof Vehicle));
		System.out.println("car instanceof Vehicle: "
				+ (car instanceof Vehicle));
		System.out.println("car instanceof Car: " + (car instanceof Car));
		System.out.println("car instanceof DriveCar: "
				+ (car instanceof DriveCar));
		System.out.println("moto instanceof Vehicle: "
				+ (moto instanceof Vehicle));
		System.out.println("moto instanceof MotorCycle: "
				+ (moto instanceof MotorCycle));

		// those will evaluate to false
		System.out.println("vehicle instanceof Car: "
				+ (vehicle instanceof Car));
		System.out.println("vehicle instanceof DriveCar: "
				+ (vehicle instanceof DriveCar));
		System.out.println("moto instanceof DriveCar: "
				+ (moto instanceof DriveCar));

		// those will evaluate to false, as the object car is null
		car = null;
		System.out.println("(car=null) instanceof Vehicle: "
				+ (car instanceof Vehicle));
		System.out.println("(car=null) instanceof Car: " 
				+ (car instanceof Car));
	}

}

class Vehicle {
}

class Car extends Vehicle implements DriveCar {
}

class MotorCycle extends Vehicle {
}

interface DriveCar {
}