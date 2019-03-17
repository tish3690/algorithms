package algorithmtasks;

public class ReversedString {
	
	//Method 1
	public static String reverse1(String s) {
		if(s==null) return s;
		return new StringBuilder(s).reverse().toString();
	}
	
	//Method 2
	public static String reverse2(String s){
		
        if(s == null || s.isEmpty())    return s;      
        
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
      
        return reverse;
    }
	
	//Method 3
	public static String reverse3(String s) {
		
		char[] charArr = s.toCharArray();
		String reverse = "";
		
		for (int i = charArr.length-1; i>=0; i--) {
            reverse += charArr[i]; 
		}
		return reverse;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(reverse1("Hello World!"));
		System.out.println(reverse2("Hello Java!"));
		System.out.println(reverse3("Java is easy!"));
		System.out.println(reverse1(null));
	}


}
