package algorithmtasks;

//Greatest Common Divisor, GCF (factor), HCD (highest)
public class GCD {
	
	public static int findGCD(int a, int b) { 
		//base case 
		if(b == 0){ 
			return a; 
			} 
		return findGCD(b, a%b); 
		
//		return (b == 0) ? a : findGCD(b, a%b);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(findGCD(25,1245));
		
	}

		

}
