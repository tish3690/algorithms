package algorithmtasks;

public class Factorial {
	
	public static int factorial(int n){
		
        int result = 1;
        while(n != 0){
            result = result*n;
            n--;
        }
      
        return result;
    }
	
	public static long factorialRecursive(int n){
	    if (n == 1)
	        return 1;
	    else
	        return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialRecursive(5));
	}

}
