package programms;

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
		
	}

}
