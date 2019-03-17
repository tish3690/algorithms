package circlecalculation;

import java.util.Scanner;

public class CircleCalculation {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		double radius;//in inches
		double area;//in square inches
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle in inches:");
		radius =keyboard.nextDouble();
		area = PI * radius * radius;
		
		System.out.println("A circle of radius " + radius + " inches");
		System.out.println("has an area of " + area + " square inches");
		
	}

}
