package oopsConcepts;

public class TestCar {

	public static void main(String[] args) {

		// Static polymorphism 
		BMW obj_bmw = new BMW();
		obj_bmw.start(); // Child Class BMW should be called
		obj_bmw.stop();
		obj_bmw.theftSafety();
		obj_bmw.refuel();

		Car obj_car = new Car();
		obj_car.start();
		obj_car.stop();
		obj_car.refuel();
	//	obj_car.theftSafety(); // Parent can not have child class method
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
	
	}

}
