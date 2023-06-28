package programms;

public class Static_And_Non_Static {
	String name = "John";
	static int age = 23;

	public static void main(String[] args) {
		// Static Methods
		// 1. Call directly
		sum();
		// 2. Call by class name
		Static_And_Non_Static.sum();

		// Call static Variables
		System.out.println(age);
		System.out.println(Static_And_Non_Static.age);

		// Call non static methods & Variables -Need to create object of the class
		Static_And_Non_Static obj = new Static_And_Non_Static();
		obj.sendMail();
		System.out.println(obj.name);
		// Can I access static method by using object reference
		// Warning - Static method should be access in a static way
		

	}

	public void sendMail() { // non static method
		System.out.println("Send mail method");

	}

	public static void sum() { // Static method
		System.out.println("Static Sum Method..");
	}

}
