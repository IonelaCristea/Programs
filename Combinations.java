/*
 * File: Combinations.java
 * --------------------------------
 * This program computes the mathematical combination function
 * C(n, k), which is the number of ways of selecting k objects
 * from a set of n distinct objects.
 * */

import java.util.Scanner;

/**
 * Date:05.08.2018
 * @author Ionela Cristea
 * @version 1.0
 */
public class Combinations {
	Scanner sc = new Scanner (System.in);
	
	/** Runs the program */
	private void run() {
		int n = 0;
		int k = 0;
		//Ask the user for a value for n and store it in a variable called n
		System.out.println("Please enter a number of objects in the set (n): ");
		//The input must be a number
		if (sc.hasNextInt()) {	
			n = sc.nextInt();	
		}
		//Ask the user for a value for k and store it in a variable called k
		System.out.println("Please enter the number to be choosen (k): ");
		//The input must be a number
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		//Ensure that the n > k
		if (n < k) {
			System.out.println("Please enter a n greater than k!");
		}
		else {
			System.out.println("C (" + n + "," + k + ") = " +  combination(n,k));
		}
	}
	
	/**
	 * 
	 * @param n the total number of items in the sample
	 * @param k the number of items to be selected from the sample
	 * @return the mathematical combination function C(n, k),
	 * which is the number of ways of selecting k objects
	 * from a set of n distinct objects
	 */
	private int combination(int n, int k) {
		return factorial(n) / (factorial (k) * factorial (n - k));
	}
	
	/**
	 * Calculates the factorial of a number
	 * @param num is the number that needed to be calculated as factorial
	 * @return the factorial number of the parameter
	 */
	private int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}	
		return result;
	}
	
	/**
	 * Main method 
	 * @param args
	 */
	public static void main (String[] args) {
		Combinations ec =  new Combinations();
		ec.run();
	}
}
