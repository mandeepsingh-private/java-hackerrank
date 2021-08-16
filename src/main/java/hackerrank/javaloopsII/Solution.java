package hackerrank.javaloopsII;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 0; j < n; j++) {
				int answer = 0;
				answer = answer + a;
				for (int k = 0; k <= j; k++) {
					int calcPow = (int) java.lang.Math.pow(2, k);
					answer = answer + (calcPow * b);

				}
				System.out.print(answer + " ");
			}
			System.out.println();

		}

		in.close();

	}
}
