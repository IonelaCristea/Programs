/*
 * This program reads a list of number inserted by the user and calculate the Standard Deviation
 * of the given list of numbers.
 * Standard Deviation:
 * 1. Calculate the average number of the list
 * 2. Calculate the square number of the difference between each number and average number
 * and make a total of these.
 * 4. Calculate the square root of the resulting quality, which represents the Standard Deviation.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date 18.09.2018
 * @author Ionela Cristea
 * @version 1.0
 */
public class StandardDivision {
	//Scanner
	Scanner userInput = new Scanner(System.in);
	//Array list where the user input is added 
	private ArrayList<Double> list = new ArrayList<>();
	//The val of this sentinel breaks the loop 
	private static final double SENTINEL = 0;
	
	
	/**
	 * Runs the program
	 */
	protected void run() {
		//Asks the user for input
		System.out.println("This program calculates the Standard Deviation of a list of numbers.");
		System.out.println("Please insert numbers to the list! To sighn the end, insert " + SENTINEL);
		//Read the user input
		while (true) {
			//Make sure the user inserts only numbers
			try {	
				//Store the input in a double
				Double numVal = userInput.nextDouble();
				//If the user input val is equal to the sentinel, stop asking for inputs
				if(numVal == SENTINEL)break;
				//Othewise add the number to the arraylist
				list.add(numVal);
			
			} catch (Exception e){
				System.err.println("You can insert only numbers.");
				userInput.next();
				//continue();
			}	
		}
		
		//Calculates the average number of the list
		Double averageNum = calculateAverageNum(list);
		//System.out.println(calculateAverageNum(list));
		
		//Calculate the total of the square number of the difference between each number and average number
		double totalDifSquareOfDifNumAver = totalDifSquareOfDifNumAverage(averageNum);
		
		//Calculate the Standard Deviation
		double stDev = standardDeviation(totalDifSquareOfDifNumAver);
		System.out.println("The Standard Deviation of the inserted numbers is " + stDev);

	}

	/**
	 * This function calculates the Standard Deviation
	 * @param totalDifSquareOfDifNumAver the total of the square numbers,
	 *  which represents the difference between average and each number
	 * @return Standard Deviation
	 */
	private double standardDeviation(double totalDifSquareOfDifNumAver) {
		double stDev = Math.sqrt(totalDifSquareOfDifNumAver);
		
		return stDev;
	}

	/**
	 * This function calculates the total of the square number of the difference between each number and average number
	 * @param averageNum of the list
	 * @return total 
	 */
	private Double totalDifSquareOfDifNumAverage(Double averageNum) {
		ArrayList<Double> calculateDifNumAndAver = calculateDifNumAndAverage(list, averageNum);
		double total = 0;
		for (int i = 0; i < calculateDifNumAndAver.size(); i++) {
			total += calculateDifNumAndAver.get(i)*calculateDifNumAndAver.get(i);		
			}
		return total;
	}
	

	/**
	 * Calculate the average number of the list
	 * @param list with the number that are inserted by the user
	 * @return the average number of the list
	 */
	private Double calculateAverageNum(ArrayList<Double> list) {
		Double total = 0.0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total / list.size();
	}
	
	/**
	 * Calculate the difference between each number and average number
	 * @param list with the inserted numbers 
	 * @return a list with numbers that represent the difference between numbers of the list and average
	 */
	private ArrayList<Double> calculateDifNumAndAverage(ArrayList<Double> list, Double averageNum){
		ArrayList<Double> storeDiference = new ArrayList<>();
		double diference = 0.0;
		for (int i = 0; i < list.size(); i++) {
			diference = list.get(i) -averageNum;
			storeDiference.add(diference);
		}
//		for (Double d : storeDiference) {
//			System.out.println(d);
//		}
		return storeDiference;
		
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		ExercicesArray_StandardDivision stDev = new ExercicesArray_StandardDivision();
		stDev.run();
	}

}
