# Programs
/**
 * This program search for a positive number in an array, which must be sorted in ascending or descending order.
 * If the key number is greater than the middle number, then it will set the middle number
 * as the start of the string, and keep searching in the same way. If the key has the same
 * value as the middle, then return true. If the number is less than middle number, then 
 * the middle number will be set as the last number of the list. Return false if the key number
 * does not appear on the list.
 */

package lessons;

import java.util.Scanner;

public class Array_BinarySearch_Numbers {
	
	Scanner sc = new Scanner (System.in);
	// Array of integers that should not allow order changes 
	private int[] list= { 1, 4, 5, 6, 7, 8, 9,};
	
	/**
	 * run() Runs the program
	 */
	public void run() {
		// Key number to be searched 
		System.out.println("Insert a number to be searched in the list: ");
		String numToBeSearched = sc.nextLine();
		//Check if the number is an integer
		if (!isInteger(numToBeSearched)) {
			System.out.println(numToBeSearched + " is not a number. Please insert a number!");
		} else {
			Integer keyNum = Integer.valueOf(numToBeSearched);
			// If the key number was found, tell the user that
			if(serachForNumber(keyNum, list)) {
				System.out.println(numToBeSearched + " was found.");
			} else {
				// Otherwise, display: number not found
				System.out.println(numToBeSearched + " was not found.");
			}
			
		}
		
	}
	
	/**
	 * Search in the list for the key number
	 * @param keyNum to be searched
	 * @param list with number to search
	 * @return false if the number was not found
	 */
	private boolean serachForNumber(int keyNum, int[] list) {
		//Set the start as 0
		int start = 0;
		// Set last number as the last in the list
		int last = list.length - 1;
		// While the condition true
		while (start <= last) {
			// Set the middle number of the list
			int middle  = (start + last) / 2;
			// If the key number is greater than the middle, then
      // set the start of the list, the middle number +1.
			if (keyNum > middle) {
				start = middle + 1;
				}
				//Return true if the key number val is the same as the middle number
				else if (keyNum == middle) {
					return true;
				}
				else {
        // If the key number is less than the middle number of the lis
        // set the end of the list the middle number -1;
					last = middle - 1;
				}
			//Reset the middle of the list
				middle  = (start + last) / 2;
		}
		return false;
	}
	
	/**
	 * Reads the input and check if is an integer
	 * @param input key number
	 * @return true if the input is a digit
	 */
	private boolean isInteger (String input) {
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i)) == false) 
				return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		Array_BinarySearch_Numbers bs = new Array_BinarySearch_Numbers();
		bs.run();

	}

}
