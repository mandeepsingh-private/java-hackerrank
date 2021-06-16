package com.mandeep.hackerrank.patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = 1;
		while (testCases > 0) {
			String pattern = "[AZ[a-z](a-z)";
			// Write your code
			try {
				if (Pattern.compile(pattern) instanceof Pattern) {

					System.out.println("Valid");
				}
			} catch (Exception e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
