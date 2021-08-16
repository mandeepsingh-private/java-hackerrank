package hackerrank.regex;

class Solution {

	public static void main(String[] args) {

		String IP = "000.12.12.034";
		System.out.println(IP.matches(new MyRegex().pattern));

	}
}

// Write your code here
class MyRegex {
	String pattern = "\\d+";
}