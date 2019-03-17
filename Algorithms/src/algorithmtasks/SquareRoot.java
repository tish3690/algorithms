package algorithmtasks;

public class SquareRoot {
	

//	X=75 and so the nearest square number S = 81. This means that sqrtS = 9.
//	Put the bits in the formula:
//	sqrt75 = 9 + (75-81)/2*9 
//	sqrt75 = 9 + -6/18 = 9 - 0.333 = 8.667
	
	public static double sqrt(int n) {
		double t;
	 
		double squareRoot = n / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (n / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sqrt(64));
		System.out.println(Math.sqrt(38));
		
	}
	

}
