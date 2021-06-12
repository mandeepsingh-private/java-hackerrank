package com.mandeep.hackerrank.javaStringReverse;

import java.util.Scanner;

/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Sample Input
	madam
Sample Output
	Yes
 */
public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		// create a char array to hold reverse string
		char[] reversed = new char[A.length()];
		int len = A.length();
		// reverse it
		for (int i = 0, j = len - 1; i < len; i++, j--) {
			reversed[j] = A.charAt(i);
		}
		// compare and print result
		for (int i = 0; i < len; i++) {
			if (A.charAt(i) != reversed[i]) {
				System.out.println("No");
				break;
			} else if (i == len - 1) {
				System.out.println("Yes");

			}
		}

	}
}
