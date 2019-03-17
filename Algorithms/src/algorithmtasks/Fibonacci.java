package algorithmtasks;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in sequence:");
        int n = sc.nextInt();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            a = a + b;
            b = a - b;
            System.out.print(a + " "); 
        }
        /*
         * a=0+1=1
         * b=1-1=0
         * 
         * a=1+0=1
         * b=1-0=1
         * 
         * a=1+1=2
         * b=2-1=1
         * 
         * a=2+1=3
         * b=3-1=2
         * 
         * a=3+2=5
         * b=5-2=3
         */
        sc.close();
    }

}
