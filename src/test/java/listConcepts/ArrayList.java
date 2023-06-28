
package listConcepts;

import java.util.Iterator;

/*
 * 1. Array list is a dynamic array with dynamic size we can store any length of data
 * We use collections.
 * One of the important collection is Array List
 * 2. it contains duplicate values/ elements
 * 3. maintains insertion order
 * 4. it's not synchronized due to that it's slow
 * 5. Allows random access to fetch any element because it stores value at index
 */

public class ArrayList {

	public static void main(String[] args) {

		java.util.ArrayList<Integer> ar = new java.util.ArrayList<Integer>();
		ar.add(12);
		ar.add(13);
		ar.add(14);
		int length = ar.size(); // Get the size of the array
		System.out.println("Length=" + length);
		java.util.ArrayList<String> ar1 = new java.util.ArrayList<String>();
		ar.remove(2);
		length = ar.size();
		System.out.println("Length=" + length);

		// fetch all the values of array list
		// 1. For loop 2. Iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// 2. Iterator to traverse the value
		java.util.ArrayList<Integer> a1 = new java.util.ArrayList<Integer>();
		a1.add(10);
		a1.add(11);
		a1.add(12);

		Iterator<Integer> itr = a1.iterator();
		while (itr.hasNext()) {
			int value = itr.next();
			System.out.println("Value=" + value);
		}

	}

}
