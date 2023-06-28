package oopsConcepts;

public class ConstructorConcept {
	
	// Class Variable
	String name;
	int age;
	public ConstructorConcept() {    // 0 parameter constructor
		System.out.println("Default Const...");
	}

	public ConstructorConcept(int i) {    // 0 parameter constructor
		System.out.println("one parameter constructor");
	}

	public ConstructorConcept(int i, int j) {    // 0 parameter constructor
		System.out.println("Two parameter constructor");
	}

	public ConstructorConcept(int i, int j, int k) {    // 0 parameter constructor
		System.out.println("Three parameter constructor");
	}
	public ConstructorConcept(String name, int age) {
		this.name=name; // this.class variable=local variable
		this.age=age;
		
	}

	public static void main(String[] args) {
		ConstructorConcept cobj = new ConstructorConcept();
		ConstructorConcept cobj1 = new ConstructorConcept(10);
		ConstructorConcept cobj2 = new ConstructorConcept(10,20);
		ConstructorConcept cobj3 = new ConstructorConcept(10,20,30);
		ConstructorConcept cobj4 = new ConstructorConcept("John",40);
		System.out.println(cobj4.name);
		System.out.println(cobj4.age);

	}

}
