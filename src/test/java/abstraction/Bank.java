package abstraction;

// At least one method should be abstract method

public abstract class Bank {

	public abstract void loan(); // No method body

	public void credit() {
		System.out.println("This is Credit..");
	}

	public void debit() {
		System.out.println("This is Debit..");
	}

}
