package algor;

public class PrintWithouWord {
	
	
	public static void main(String args[]) {
		
		String str = "I love my country";
		
		str.split(" ");
		
		int index = str.indexOf("my");
		
		System.out.println(str.substring(0, index) + str.substring(index + 1));
		
		StringBuilder sb = new StringBuilder(str);
		
//		System.out.println(sb.indexOf("my"));
		
		sb.delete(7, 9);
		
		System.out.println(sb);
		
		String newstr = str.substring(0, 7) + str.substring(9 + 1);
		
		System.out.println(newstr);
	}
}
