/*
 * File: AddIntegerList.java
 * --------------------------
 * This program reads integers, one per line until the
 * user enters a specific sentinel value to signal the
 * end of the input. At this point, the program
 * prints out the sum of the numbers entered so far
 * */



import java.util.Scanner;

/**
 * Date: 17.09.2018
 * 
 * @author Ionela Cristea
 * @version 1.0
 */
public class AddIntegersList {
	Scanner sc = new Scanner(System.in);
	/* Specifies the value of the sentinel */
	private static final int SENTINEL = 0;

	/**
	 * Runs the program
	 */
	private void run() {
		// Tell the user what the program does
		System.out.println("This program calculate the sum of a list with numbers. ");
		System.out.println();
		// Ask the user for a number
		System.out.println("Enter a number, one per line, using " + SENTINEL);
		System.out.println("to signal the end of the list. ");
		// Initiate the total
		int total = 0;
		// Keep asking the user for a number
		while (true) {
			System.out.println(" ? ");
			// Read the input
			String input = sc.nextLine();
			// If the input is not an integer, ask for integers only
			if (!isInteger(input)) {
				System.err.println("Please insert only numbers!");
			} else {
				// If the value is an integer
				int value = Integer.parseInt(input);
				// If the input is the SENTINEL, show the total
				if (value == SENTINEL)
					break;
				total += value;
			}
		}
		// Display the total
		System.out.println("The total is " + total + ".");
	}

	/**
	 * Check if the parameter value is a an integer
	 * 
	 * @param str to be checked
	 * @return true if the parameter is an integer
	 */
	private boolean isInteger(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) == false)
				return false;
		}
		return true;
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExecicesAddIntegersList addIntList = new ExecicesAddIntegersList();
		addIntList.run();
	}

}
