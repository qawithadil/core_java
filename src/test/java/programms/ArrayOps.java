package programms;
/*
 * Advantages: Multiple value storing in a single value with similar data type
 * Disadvantages: 
 * 1. Size is fixed, so if we have more or less value then we can't fit into a fixed length value
 * 2. Stores only simmilar data type values
 *
 */

public class ArrayOps {

	public static void main(String[] args) {

		// 1. integer array

		int i[] = new int[10]; // Length index = 0 to 9
		i[0] = 10;
		i[1] = 20;
		i[3] = 30;
		// i[10]=50; Array indexoutofBound error when storing data at 11th position
		int length = i.length; // size of array
		System.out.println("Size of array=" + length);

		// Print values of Array
		for (int j = 0; j < length; j++) {
			System.out.println(i[j]);
		}

		// 2. Double Array

		double d[] = new double[5];

		// 3. String aaray

		String s1[] = new String[10];
		s1[0] = "S1";
		System.out.println(s1[0]);

		Object ob[] = new Object[5]; // Object is a class
		ob[1] = "String_value";
		ob[2] = "%^%^%&^%&";
		ob[3] = "C";
		ob[4] = "123C^%^";
		for (int k = 0; k < ob.length; k++) {
			System.out.println(ob[k]);
		}
		
		

	}

}
