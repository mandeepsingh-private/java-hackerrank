package hackerrank.fitjavadatatype;

import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		System.out.println("Enter how many numbers to evaluate and the numbers: ");

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				}
				if (x >= -32768 && x <= 32768) {
					System.out.println("* short");
				}
				if (x >= -java.lang.Math.pow(2, 31) && x <= java.lang.Math.pow(2, 31) - 1) {
					System.out.println("* int");
				}
				if (x >= -java.lang.Math.pow(2, 63) && x <= java.lang.Math.pow(2, 63) - 1) {
					System.out.println("* long");
				}
				// Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
		sc.close();
	}
}