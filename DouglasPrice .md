/*
 * This program reads a number from the user input and displays the
 * Hailstone sequence for that number
 * if is even: divide it by two
 * if is odd: multiply it by three and add one
 * */

package lessons;

import java.util.Scanner;

public class DouglasPrice {
	Scanner sc = new Scanner(System.in);
	//Initiate the sentinel 
	private static final int SANTINEL = 1;

	private void run() {
		// Initiate the count
		int count = 0;
		//Ask the user for input and store it in a variable 
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		// Set a temporary value that is equal to the inserted number
		int tempNum = num;
		
		//If the user inputs a negative number stop asking for imputs
		if (num < 0) {
			System.err.println("Please insert a positive mumber!");
			num = SANTINEL; 
		}
		
		//While the inserted number is not the sentinel
		while (num != SANTINEL) { 
			//Check if the number is even
			if (num % 2 == 0){ 
				//if it is, divide it by 2, and store the value into a temporary number
				tempNum /= 2;
				//Display the inserted number, and the value after division 
				System.out.println(num + " is even so I take half: " + tempNum);
				// If the value is 1
				//stop the loop
				if (num == 1) {
					num = SANTINEL;			
				}
				//Set the value of the initial number to the temporary number
				num =  tempNum;
			}
			//If the number is odd
			else {
				//Calculate the new value of the number, and store it in a temporary number
				tempNum = (3 * num +1);
				//Display the initial value inserted by the user, and its temporary value after the calculation
				System.out.println(num + " is odd, so I make 3n+1: " + tempNum);
				//Store the temporary value into the initial number
				num =  tempNum;
			}
			count++;
		}
		//Print out the result
		System.out.println("The process took " + count + " to reach 1!");
	}
	
/**
 * Main method
 * @param args
 */
	public static void main(String[] args) {
		DouglasPrice oddOrEven = new DouglasPrice();
		oddOrEven.run();

	}

}
