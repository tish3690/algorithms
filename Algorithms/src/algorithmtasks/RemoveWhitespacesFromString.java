package algorithmtasks;

public class RemoveWhitespacesFromString {
	
	public static String removeWhitespaces(String str) {
		String str1 = "";
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(Character.isLetter(str.charAt(i))) str1 = str1 + str.charAt(i);
		}
		return str1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(removeWhitespaces("     diufyg  h h h h "));
		
	}

}
