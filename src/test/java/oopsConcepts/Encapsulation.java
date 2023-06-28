package oopsConcepts;

public class Encapsulation {
	private String name; // Private members
	private int age;

	public void setName(String name) { // Member functions
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		enc.setName("John");
		enc.setAge(22);
		System.out.println("Name=" + enc.getName());
		System.out.println("Age=" + enc.getAge());

	}

}
