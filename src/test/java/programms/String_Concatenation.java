package programms;
/*
 * Operations occurred from left to right
 */

public class String_Concatenation {

	public static void main(String[] args) {
		
		int a =100;
		int b=200;
		String x="hello";
		String y="world";
		System.out.println(a+b);         // 300
		System.out.println(x+y);        // HelloWorld 
		System.out.println(a+b+x+y);    // 300Helloworld
		System.out.println(x+y+a+b);   // HelloWorld100200
		System.out.println(x+y+(a+b)); // HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y);  // 300helloworld100hello200world        
		

	}

}
