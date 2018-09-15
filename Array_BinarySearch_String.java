/**
* Finds an instance of the specified key in the array, which must
* be sorted in lexicographic order. If the key exists, the method
* returns true.
* If key does not appear in the array, findStringInSortedArray
* returns false.
*
* This implementation uses the "binary search" algorithm. At
* each stage, the function computes the midpoint of the remaining
* range and compares the element at that index position to the
* key. If there is a match, the function returns the index.
* If the key is less than the string at that index position, the
* function searches in the first half of the array; if the key is
* larger, the function searches in the second half of the array.
*/

package lessons;

import java.util.Scanner;

public class Array_BinarySearch_String {
	
	Scanner sc  = new Scanner(System.in);
	/* User input */
	String city;
	/* List of cities in the USA */
	String[] cityNames = {
			 "Atlanta",
			 "Boston",
			 "Chicago",
			 "Denver",
			 "Detroit",
			 "Houston",
			 "Los Angeles",
			 "Miami",
			 "New York",
			 "Philadelphia",
			 "San Francisco",
			 "Seattle",
	};
	
	/**
	 * Ask the user for a city and tell him if that city was fount on the list or not.
	 */
	public void askForKey() {
		System.out.println("This program searches in a list a city inserted by the user. ");
		System.out.println("Please insert a city in the USA: ");
		//Read user input
			city = sc.nextLine();
			// Search for the city
		int indexCity = getIndexCity(city);
		// Tell the user if the city was fount on the list
		System.out.println(cityNames[indexCity] + " was found.");

	}
	/**
	 * Gets the index of the city in the array list. 
	 * @param city that is searched in the array
	 * @return the index of the city.
	 */
	private int getIndexCity(String city) {
		int index = -1;
		while (index == - 1) {
			index = findStringInSortedArray(city, cityNames);
			//If n index value found
			if (index == -1) {
				System.out.println("Unknown city -- try again!");
				city = sc.nextLine();
			}
		}
		return index;
	}
	
	/**
	 * Search for the key string in the array
	 * @param key word/city to search for
	 * @param array with list of elements 
	 * @return -1 if the element was not found
	 */
	
	//Looks for a key string in an array and return the 
 	private int findStringInSortedArray(String key, String[] array) {
		//Set the first index element of the array to 0
		int leftHand = 0;
		//Set the last index array list element to array length -1 
		int rightHand = array.length - 1;
		while (leftHand <= rightHand) {
			//Set the index of the middle array element to array length/2
			int mid = (leftHand + rightHand) / 2;
			//Compare the key string to the string from the middle of the array
			int cmp = key.compareTo(array[mid]);
			//If these elements have the same value
			if (cmp == 0) {
				//return the the index of the middle element
				return mid;
			}
			//If the comparison returns less than 0, that means the key word is, 
			//lexicographically less than the string argument.
			if (cmp < 0) {
				//Set the end of the array the index of the middle element -1;
				rightHand = mid - 1;
			}
			//Otherwise, set the first element of the string the at the index of the middle element +1
			else {
				leftHand = mid + 1;
			}
			
		}
		return -1;			

	}


	public static void main(String[] args) {
		Array_BinarySearch_String scity = new Array_BinarySearch_String();
		scity.askForKey();

	}
}


