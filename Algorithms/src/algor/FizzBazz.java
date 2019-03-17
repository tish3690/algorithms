package algor;

import java.util.Scanner;

public class FizzBazz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input  = sc.nextInt(); //5
		int[] numbers = new int[input];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] == 3 || numbers[i]%3 == 0 && numbers[i]%5 != 0) {
				System.out.println("Fizz");
			}else 
				if(numbers[i] == 5 || numbers[i]%5 == 0 && numbers[i]%3 != 0){
				System.out.println("Buzz");
			}else
				if(numbers[i]%3 == 0 && numbers[i]%5 ==0) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println(numbers[i]);
				}
		}

	}



}
