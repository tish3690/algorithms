package algor;

import java.util.Scanner;

public class PalindromSentence {
	
	public static boolean isPalindrome(String str) {
		String s ="";
		 for ( int i = 0; i<str.length(); i++) {
			 if(Character.isLetter(str.charAt(i))) {
				 s += s.charAt(i);
			 }
		 }
		 boolean palindrome = true;
		 for ( int j =0; j<s.length()/2; j++) {
			 if(String.valueOf(s.charAt(j)).equalsIgnoreCase(String.valueOf(s.charAt(s.length()-1-j)))) {
				 continue;
			 }else {
				 palindrome = false;
				 break;
			 }
		 }
		 
		 return palindrome;
		 
	}
	
	public static boolean isPalindrome1(int a) {
		String str = String.valueOf(a);
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	
public static void main(String[] args) {
	
//	System.out.println(isPalindrome("Top spot"));
	

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		 String s = sc.nextLine();
		 String str = "";
		 
		 //iterate over the string and remove all the spaces
		 for ( int i = 0; i<s.length(); i++) {
			 if(Character.isLetter(s.charAt(i))) {
				 str += s.charAt(i);
			 }
		 }
		 
		 boolean isPalindrome = true;
		 
		 //check if first and last letter are the same
		 for ( int j =0; j<str.length()/2; j++) {
			 if(String.valueOf(str.charAt(j)).equalsIgnoreCase(String.valueOf(str.charAt(str.length()-1-j)))) {
				 continue;
			 }else {
				 isPalindrome = false;
				 break;
			 }
		 }
		 if(isPalindrome) {
			 System.out.println("Your sentence is Palindrome");
		 }else
			 System.out.println("Your sentence is not a Palindrome");
		

	}


}
