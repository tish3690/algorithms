package algor;

public class CheckPalidromNumber {
	
	public static boolean isPalindromeAdv(int integer) {
	    String intStr = String.valueOf(integer); 
	    return intStr.equals(new StringBuilder(intStr).reverse().toString());
	}
	
	public static boolean isPalindrome(int integer) {
	    int palindrome = integer;
	    int reverse = 0;

	    // Compute the reverse
	    while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }

	    // The integer is palindrome if integer and reverse are equal
	    return integer == reverse; 

	}
	
	public static void main(String[] args) {

		int original = 1556;
		int reverse = 0;
		int temp = original;

		while (temp != 0) {
			reverse = reverse * 10;
			reverse = reverse + (temp % 10);
			temp = temp / 10;
			// rev 0 rev 10 rev 120
			// rev 1 rev 12 rev 121
			// temp 12 temp 1 rev 0

		}
		
		if(reverse == original) 
			System.out.println(reverse + " is a Palindrome");
		
		else 
			System.out.println(reverse + " is not a Palindrome");
		
		
		System.out.println(isPalindromeAdv(1111));
		
	}

}

