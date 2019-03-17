package algor;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = sc.nextInt();//5
		int count = 1;
		BigInteger countForBig;
		
		if(factorial < 0) {
			System.out.println("Invalid input");
		}else if(factorial == 0) {
			count = 1;
			System.out.println(count);
		}else if(factorial > 0 && factorial < 13) {
			for(int i=1; i<=factorial; i++) {
				count *= i;
			}
			System.out.println(count);
		}else if(factorial > 12) {
			countForBig = new BigInteger("1");
			for(int i=1; i<=factorial; i++) {
				countForBig = countForBig.multiply(BigInteger.valueOf(i));
			}
			System.out.println(countForBig);
		}

	}

}


