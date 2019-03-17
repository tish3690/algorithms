package algorithmtasks;

public class PalindromeNumber {
	
	public static boolean isPalindrome1(int a) {
		String str = String.valueOf(a);
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	public static boolean isPalindrome2(int a) {
		
		int reverse = 0;
		int temp = a;
	
		while(a > 0) {
			int remainder = a % 10;
			reverse = reverse*10 + remainder;
			a = a/10;
		}
		
		return temp == reverse;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome1(123321));
		System.out.println(isPalindrome2(123321));
		
		
		
		int reverse = 0;
		int a = 123321;
		int n = a;
		while(a > 0) {
			int remainder = a % 10;
			reverse = reverse*10 + remainder;
			a = a/10;
		}
		
		if(n==reverse) System.out.println("A is a palindrome");
		else System.out.println("A is NOT a palindrome");
		
	}

}
