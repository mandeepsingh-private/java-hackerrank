package hackerrank.javastack;

import java.util.Scanner;
import java.util.Stack;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();

			Stack<Character> stack = new Stack<Character>();

			for (char c : line.toCharArray()) {
				if (c == '{' || c == '[' || c == '(') {
					stack.push(c);
				}
				if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
					stack.pop();

				} else if (c == '}' && stack.isEmpty()) {
					stack.push(c);
				}
				if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
					stack.pop();

				} else if (c == ']' && stack.isEmpty()) {
					stack.push(c);
				}
				if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();

				} else if (c == ')' && stack.isEmpty()) {
					stack.push(c);
				}
			}
			if (stack.isEmpty()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

		}
	}
}