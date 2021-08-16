package hackerrank.javadatetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayofweek);
		System.out.println(c.getTime());
		switch (dayofweek) {

		case 2:
			return "MONDAY";
		case 3:
			return "TUESDAY";
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THURSDAY";
		case 6:
			return "FRIDAY";
		case 7:
			return "SATURDAY";
		default:
			return "SUNDAY";
		}

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		System.out.println(res);
		// bufferedWriter.write(res);
		// bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
