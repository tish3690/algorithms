package algor;

import java.util.Scanner;

public class GreatestCDivision {
	
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD");
		int number1 = scanner.nextInt();
		System.out.println("Please enter second number to find GCD");
		int number2 = scanner.nextInt();
		System.out.println("GCD of two numbers " + number1 + " and " + 
		number2 + " is :" + findGCD(number1, number2));
		
		
	}

	private static int findGCD(int n1, int n2) { 
		if (n2 == 0) {
			return n1;
		}
		return findGCD(n2, n1 % n2);
	}


}
