/*
 * File:MorseCode.java
 * ------------------- 
 * This program has two ways of translating normal text to Morse code.
 * Both versions have the same output.
 * The program asks the user to insert a text, and then outputs that text
 * in Morse code.
 */


import java.util.HashMap;
import java.util.Scanner;
/**
 * Date: 18.01.2018
 * @author Ionela Cristea
 * @version 1.0
 */
public class MorseCode {
	Scanner sc = new Scanner(System.in);
	
	/********************************Version_1*******************************************/
	
	//Store the Morse code in an array type string
	String[] morseCode = {
			"-...", "-.-.", "-..", ".", "..-.", "--.", "....", ".." ,
			".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
			"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			};
	////Store the alphabet characters in an array
	char [] alphabet = {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
	};
	
	
	private void versionOne() {
		//Ask the user for some text to be translated
		System.out.println("Insert a text to be translated in Morse Code");
		String text= sc.nextLine();
				
				text = text.toUpperCase();
				//For each character from the text at the index [i] 
				//search in the alphabet and find its correspondent as a char[j]
				//as alphabet and Morse code has the same index, 
				// print each character at the same index as the one from the alphabet
			
				for (int i = 0; i < text.length(); i++) {
					for (int j = 0; j < alphabet.length; j++) {
						if (text.charAt(i) == alphabet[j]) {
							System.out.print(morseCode[j] + " ");
						}
					}
				}

	}
	
	
	
	/******************************** Version_2 ***************************************/
	public void versionTwo() {
		HashMap<String, String > dictionary = new HashMap<>();
		//Declares the index of a string Alphabet and string Code at the same index
		dictionary.put(" ", " ");
		dictionary.put("A", ".-");
		dictionary.put("B","-..." );
		dictionary.put("C", "-.-.");
		dictionary.put("D",  "-..");
		dictionary.put("E", ".");
		dictionary.put("F", "..-.");
		dictionary.put("G", "--.");
		dictionary.put("H", "....");
		dictionary.put("I", ".." );
		dictionary.put("J", ".---");
		dictionary.put("K", "-.-");
		dictionary.put("L", ".-..");
		dictionary.put("M", "--");
		dictionary.put("N", "-.");
		dictionary.put("O", "---");
		dictionary.put("P", ".--.");
		dictionary.put("Q", "--.-");
		dictionary.put("R", ".-.");
		dictionary.put("S", "...");
		dictionary.put("T", "-");
		dictionary.put("U", "..-");
		dictionary.put("V", "...-");
		dictionary.put("W", ".--");
		dictionary.put("X", "-..-");
		dictionary.put("Y", "-.--");
		dictionary.put("Z", "--..");
		
		//Asks the user to input some text
		System.out.println("Insert a text to be translated in Morse Code");
		String text = sc.nextLine();
		System.out.println("text:" + text);
		
		String morse = "";
		
		// For each character from the text
		//sets the the output as a corresponding key value 
		for (char c : text.toCharArray()) {
			morse += dictionary.get((c + "").toUpperCase()) + " ";
			
		}
		//Prints the result
		System.out.println("morse: " + morse);
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		MorseCode mc = new MorseCode();
		mc.versionOne();
		
	}

}
