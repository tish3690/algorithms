package algor;

public class PrimeNumber {
	
	public boolean primeNumber(int n) {
		for (int i=2; i<n; i++) {
			if(n%i == 0){
			return false;	
			}
			
		}
		return true;
		}

}
