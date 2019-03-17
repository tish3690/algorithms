package algorithmtasks;


public class PrimeNumber {
	
	//Method 1
	public static boolean isPrime1(int n) {
		
	    //check if n is a multiple of 2
	    if (n%2 == 0) return false;
	    
	    //if not, then just check the odds
	    for(int i = 3; i*i <= n; i += 2) {
	        if(n%i == 0)
	            return false;
	    }
	    return true;
	}
	
	//Method 2
	public static boolean isPrime2(int n) {
		
		for(int i = 2; i <= n/2; i++) {
			if(n%i==0) return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(isPrime1(17));
		System.out.println(isPrime2(17));
		System.out.println(isPrime1(25));
		System.out.println(isPrime2(25));
		System.out.println(isPrime1(11));
		System.out.println(isPrime2(1));
		
	}



}
