package algorithmtasks;


public class PalindromeString {
	
	public static boolean isPalindrome(String str) {
		
		if (str==null || str.isEmpty()) return false;
		
		String s ="";
		 for ( int i = 0; i<str.length(); i++) {
			 if(Character.isLetter(str.charAt(i))) {
				 s += str.charAt(i);
			 }
		 }
		return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
	}
		 
	
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Top spot"));
		System.out.println(isPalindrome("Top top"));
		System.out.println(isPalindrome(""));
	}
		
	

}
