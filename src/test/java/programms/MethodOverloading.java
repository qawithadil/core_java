package programms;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 11);

	}

	public void sum() {
		System.out.println("Sum with 0 parameter");
	}

	public void sum(int i) { // one input parameter
		System.out.println("Sum with 1 parameter");
	}

	public void sum(int a, int b) { // two parameter
		System.out.println("Sum with 2 parameters");
	}

}
