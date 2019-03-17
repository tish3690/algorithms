package algor;

import java.util.Scanner;

public class PalindromWord {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a word");
			String word = sc.next();
			String s = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				s += word.charAt(i);
			}

			if (word.equals(s)) {
				System.out.println(word + " is a Palindrome");
			} else {
				System.out.println(word + " is not a Palindrome");
			}

		}

	}

