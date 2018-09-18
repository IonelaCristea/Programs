/**
 * This class converts hexadecimal to decimal OR
 * integer to a hexadecimal
 */

import java.util.Scanner;

/**
 * Date: 09.08.2018
 * @author Ionel Cristea
 * @version 1.0
 *
 */
public class ConvertHexadecimal2Decimal {
	Scanner sc = new Scanner(System.in);
	// Sentinel to stop reading user input
	private static final int STOP = 0;

	/**
	 * This method converts hexadecimal to decimal.
	 */
	private void convertFromHexToInt() {
		//Tell the user what is the program about
		System.out.println("This program converts hexadecimal to decimal.");
		System.out.println("Enter 0 to stop");

		while (true) {
			try {
				// Ask for a number
				System.out.println("Enter a hexadecimal number: ");
				// Store that number as userInput
				String userInput = sc.nextLine();
				// If the user wants to Stop
				String stop = Integer.toString(STOP);
				if (userInput.equals(stop))
					break;

				// Display the result
				Integer decimal = Integer.parseInt(userInput, 16);
				System.out.println("Hex value is " + decimal);

			} catch (Exception e) {
				// If the user insert something else than what is required
				System.err.println("Pls enter only leters in combination with Letters from A to F");
			}
		}
	}

	/**
	 * This method converts an integer to a hexadecimal
	 */
	private void convertIntToHex() {
		//Tell the user about the program
		System.out.println("This program converts an integer to a hexadecimal.");
		while (true) {
			try {
				//Ask for an number to be converted in hexadecimal
				System.out.println("Insert a number to convert to a hexadecimal:");
				int input = sc.nextInt();
				String retVal = Integer.toString(input, 16);
				System.out.println(input + " has a hex value of " + retVal);
			} catch (Exception e) {
				// If the user insert something else than what is required
				System.err.println("Pls insert only numbers!");
				sc.nextLine();

			}
		}

	}

	public static void main(String[] args) {
		ConvertHexadecimal2Decimal c = new ConvertHexadecimal2Decimal();
		c.convertFromHexToInt();
		//c.convertIntToHex();

	}
}
