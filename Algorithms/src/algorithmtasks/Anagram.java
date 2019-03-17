package algorithmtasks;

import java.util.Arrays;

public class Anagram {
	
	//Check if two words are anagram
	public static boolean isAnagram(String input1, String input2) {
		
		// Remove all whitespace first
		String s1 = input1.replaceAll("\\s", "");
		String s2 = input2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			return false;
		} else {
			// Convert into character array
			char[] s1Array = s1.toLowerCase().toCharArray();
			char[] s2Array = s2.toLowerCase().toCharArray();

			// Sorting both character array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			// Check if both arrays are equal
			return Arrays.equals(s1Array, s2Array);
		}
	}
	
	//Print out all the possible combinations
	
	/* * A method exposed to client to calculate permutation of String in Java. */ 
	public static void permutation(String input){ 
		permutation("", input); 
	}

	/* * Recursive method which actually prints all permutations 
	 * of given String, but since we are passing an empty String
	 * as current permutation to start with, 
	 * I have made this method private and didn't exposed it to client. */ 
	private static void permutation(String perm, String word) { 
		if (word.isEmpty()) { 
			System.out.println(perm + word); 
		}else { 
			for (int i = 0; i < word.length(); i++) { 
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
				} 
			} 
		}
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("cat", "act"));
		permutation("cat");
		
		
	}

}
