package programms;

/*
 * Comparison Operators: <, >, <=, >=, ==,!=
 */
public class Comparison_Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// boolean condition
		if (b > a) {
			System.out.println("B is greater than a");
		} else
			System.out.println("A is greater than B");

		int c = 40;
		int d = 40;
		
		// comparison operator
		if (c == d) {
			System.out.println("C&D are equals..");
		} else {
			System.out.println("C&D are not equals");
		}
		
		// Highest number
		
		int a1=100;
		int b1=300;
		int c1=200;
		if(a1>b1 && a1>c1) {
			System.out.println("A1 is greater than b1 and c1");
		}
		else if(b1>a1 && b1>c1) {
			System.out.println("B1 is greater than b1 and c1");
		}
		else if(c1>a1 && c1>b1) {
			System.out.println("C1 is greater than b1 and c1");
		}
	}
}
