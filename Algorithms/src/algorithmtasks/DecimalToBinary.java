package algorithmtasks;

public class DecimalToBinary {
	
	public static String toBinary(int a) {
		String str = "";
		int b;
		
		while(a > 0) {
			b = a % 2;
			str = str + "" + b;
			a = a/2;
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		System.out.println(toBinary(23));
		
	}

}
