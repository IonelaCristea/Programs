package lessons;

import java.util.Scanner;

public class Array_CountLetter {
	Scanner userInput = new Scanner(System.in);
	
	private int[] frequencyTable;
			
	public void run() {
		System.out.println("This program counts letters frequencies");
		System.out.println("Enter a blank line to indicate the end of the text.");
		
		frequencyTable = new int[26];
		while (true) {
			String line = userInput.nextLine();
			if (line.length() == 0) break;
			countLetterFrequencies(line);
		}
		printFrequencyTable();
		
	}
	

	private void countLetterFrequencies(String line) {
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (Character.isLetter(ch)) {
				int index = Character.toUpperCase(ch) - 'A' ;
				frequencyTable[index]++;
			}
			
		}
	}
	private void printFrequencyTable(){
		for (char ch = 'A';  ch <='Z'; ch++) {
			int index = ch - 'A';
			System.out.println(ch + ": " + frequencyTable[index]);
		}
	}
	public static void main(String[] args) {
		Array_CountLetter cl = new Array_CountLetter();
		cl.run();
	}
}
