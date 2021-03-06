package hackerrank.datastructures.reversearray;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the reverseArray function below.
	static int[] reverseArray(int[] a) {
		int[] r = new int[a.length];
		for (int j = 0, i = a.length; i > 0; j++, i--) {
			r[j] = a[i];
		}
		return r;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int arrCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
			System.out.println(arr);
		}

		int[] res = reverseArray(arr);
		System.out.println(res);

		scanner.close();
	}
}
