/**
 * File:CCalculate_Average_Number .java
 * ------------------------
 * This program asks the user for a list of numbers,
 * in  order to calculate the average number of the list.
 * To sign the end of the list, the user must insert a number sentinel.
 */


import java.util.ArrayList;

import java.util.Scanner;


/**
 * Date: 17.09.2018
 * 
 * @author Ionela Cristea
 * @version 1.0
 */

public class Calculate_Average_Number {
	
	Scanner userInput = new Scanner(System.in);
	//Declare a sentinel
	private static final double SENTINEL= 0.0;
	//Declare an array list
	private ArrayList<Double> list = new ArrayList<>();
	
	/**
	 * Runs the program
	 */
	private void run() {
		System.out.println("This program displays the average number of a list.");
		System.out.println("Enter a number, one per line, using " + SENTINEL);
		System.out.println("to signal the end of the list. ");
		//Ask the user for input until he will enter the sentinel value
		while (true) {
			//If the input is not a number stop the reading and ask the user to insert only numbers
			if (!userInput.hasNextInt()) {
				System.err.println("Please start again, and insert only numbers"); break;
			} else {
				double valNumber = userInput.nextDouble();
				//if the value of the input is sentinel, show the result
				if (valNumber == SENTINEL)break;
				//otherwise add the number to the list
				list.add(valNumber);
			}
		}
		//Display the result
		System.out.println("The average of the inserted number is " + calculateAverage(list));
	}
	
	/**
	 * Calculate the average number 
	 * @param list with numbers 
	 * @return the average number
	 */
	private Double calculateAverage(ArrayList<Double> list) {
		Double total = 0.0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		
		Double average = total / list.size();
		return average;
	}
	
	public static void main(String[] args) {
		
		ExercicesArray_Avarage average = new ExercicesArray_Avarage();
		average.run();
	}

}
