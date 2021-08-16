package hackerrank.endoffile;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 1;
		while (in.hasNext()) {
			System.out.println(count + " " + in.nextLine());
			count++;
		}
	}

}
