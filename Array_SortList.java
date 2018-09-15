/*
 * File: Array_SortList.java
 * ------------------------
 * This program reads the elements in an array list 
 * and rearrange them in an ascending order.
 */

package lessons;


public class Array_SortList {
	// The array list
	double[] list = {10, 5, 8, 25, 87, 3, 12, 1.1, 1.2 };
	
	/**
	 * Runs the program
	 */
	public void run() {
		//Sorts the list elements in an ascending order
		sortElements(list);
	}
	
	/**
	 * Searches for the smallest element from the list 
	 * and swap it with the first one, then second one, and so on.
	 * @param list of element to be sorted
	 */
	private void sortElements(double[] list) {
		//Set an initial first element to the one that is already at the index 0
		for (int left = 0; left < list.length-1; left++) {
			// Set the right element as the smallest one
			int right = getSmallestElementIndex(list, left, list.length-1);
			//Swap the left element with the one from the right
			swapElements(list, left, right);
		}
		
		//Print out each element
		for (double l : list) {
			System.out.print(l + " ");
		}
	}
	
	/**
	 * Search for the smallest element in the list
	 * @param list of elements
	 * @param left the first element from the list
	 * @param right the smallest element from the list
	 * @return the index of the smallest number
	 */
	private int getSmallestElementIndex(double[] list, int left, int right) {
		int index = left; 
		//Check if the first number form the list is second, then the third
		//If the next number is smaller, then set the index to that number
		for (int i = left + 1; i <= right; i++) {
			if (list[i] < list[index]) index = i;
		}
		
		return index;
	}

	/**
	 * Swap the numbers from the list in the ascending order
	 * @param list with elements
	 * @param left number from the list
	 * @param right the smallest number
	 */
	private void swapElements(double[] list, int left, int right) {
		//Move the first number to a temporary place
		double temp = list[left];
		//Set the first number to smallest one
		list[left] = list[right];
		// Move the val of the temporary number to the place of the smallest one
		list[right] = temp;
	}

	public static void main(String[] args) {
		Array_SortList sl = new Array_SortList();
		sl.run();

	}

}


