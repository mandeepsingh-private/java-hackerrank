package hackerrank.stringTokens;

public class Solution {

	public static void main(String[] args) {

		// Write your code here.
		String s = "He is a very very good boy, isn't he?";
		// s = "' JAPAN USA";
		s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
		s = s.replace("'", " ");
		s = s.replace("' ", " ");
		s = s.replace("?", " ");
		s = s.replace("? ", " ");
		s = s.replace(", ", " ");
		s = s.replace(",", " ");
		s = s.replace("!", " ");
		s = s.replace("@", " ");
		s = s.replace("@ ", " ");
		s = s.replace(". ", " ");
		s = s.replace(".", " ");
		s = s.replace("_ ", " ");
		s = s.replace("_", " ");
		String[] stringArray = s.split(" ");
		int count = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (!stringArray[i].equals("")) {

				count++;
			}
		}
		System.out.println(count);
		for (int i = 0; i < stringArray.length; i++) {
			if (!stringArray[i].equals("")) {
				System.out.println(stringArray[i]);
			}
		}

	}
}
