package algor;

public class ReversingString {
	public static void reverse(String s) {
		if(s==null || s.length()<=1) {//base case
			System.out.println(s);
		}
		else{ //recursive case
			System.out.print(s.charAt(s.length()-1)+",");
			reverse(s.substring(0, s.length()-1));
		}
	}
	
	public static void main(String[] args) {
		reverse("Cybertek");
	}

}
