package hackerrank.currencyformatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
/*
 * input 12324.134
 * output
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.

		DecimalFormat formatter = new DecimalFormat("###,###.00");
		double roundOff = Math.round(payment * 100) / 100.00;
		String us = NumberFormat.getCurrencyInstance().format(roundOff);
		String india = "Rs." + formatter.format(roundOff);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(roundOff);
		String france_initial = NumberFormat.getCurrencyInstance(Locale.FRENCH).format(roundOff);
		int len = france_initial.length();
		String france = france_initial.substring(0, len - 1) + " €";
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}