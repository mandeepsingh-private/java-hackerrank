package hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();

			Stack<Character> stack = new Stack<>();

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
