package oopsConcepts;

public class Inheritence {
	void show() {
		System.out.println("This is parent method");
	}


public static void main(String[] args) {
		Child ch1= new Child();
		ch1.show();
		Inheritence p1= new Inheritence();
		p1.show();
		Inheritence p3= new Child(); // Upcasting 
		p3.show();

	}

}
class Child extends Inheritence{
	void show() {
		System.out.println("This is child method..");
	}
	
}
