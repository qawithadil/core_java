package programms;

public class Logical1 {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + b + x + y + a + x + b + y);
		
		int i=1;
		int j=i++; // 1st assignment then increment
		System.out.println("i="+i+"& J="+j);
		System.out.println("J="+j);
		
		int k=1;
		int l=++k; // 1st increment then assignment
		System.out.println("k="+k+"& l="+l);
	}

}
