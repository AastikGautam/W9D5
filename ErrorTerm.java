package errorterm;

/**
 * Error Term computation for Square, Square Root & Cube
 * @author Aastik Gautam
 * version 1.0     09-03-2018 
 */

import java.text.DecimalFormat;

import java.util.Scanner;

public class ErrorTerm {
	public static boolean abc(double n) {

		if (n==0.5) {

			boolean answer = true;

			return answer;

		}

		if (n==2) {

			boolean answer = true;

			return answer;

		}

		if (n==3) {

			boolean answer = true;

			return answer;

		}

		else {

			boolean answer = false;

			return answer;

		}

}

	public static String exponent(double n, double measuredquantity, double ErrorTerm) {

		if (abc(n)==true) {

		double EF = ErrorTerm / measuredquantity;

		double p = Math.pow(measuredquantity, n);

		double PowerET = Math.abs(p * EF);

		DecimalFormat a = new DecimalFormat("####.##");

		String roundoffed = a.format(PowerET);

		String roundoffed1 = a.format(p);

		String result = roundoffed1 +" \u00B1 " + roundoffed;

		return result;

		}

		else return "Only sr, sq and cu is Recognized";

	}



public static void main(String[] args) {		

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the Value");

		double value1 = keyboard.nextDouble();

		

		System.out.println("Enter the Error Term");

		double errorTerm1 = keyboard.nextDouble();

			

		System.out.println("Enter '0.5' for Squareroot, '1' for Square and '3' for Cube");



		double n = keyboard.nextDouble();

		String result =exponent(n, value1, errorTerm1);	

				System.out.println(result);

			

		keyboard.close();

	}

}

