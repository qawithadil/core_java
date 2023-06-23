package programms;

public class Incremental {

	public static void main(String[] args) {
		int i = 1;
		int j = i++; // Post Increment : First assign the i value to j then increment i
		System.out.println("i=" + i + "j=" + j); // i=2 j=1

		int k = 1;
		int l = ++k; // Pre Increment : First increment k then assign value to l
		System.out.println("k=" + k + "l=" + l); // k=2 l=2

		int m = 2;
		int n = m--;
		System.out.println("n=" + n + "m=" + m); // n=2 m=1

	}

}
