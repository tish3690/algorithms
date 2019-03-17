package lambda;

import java.util.Comparator;

public class Explanation {
	
	//enables functional programming
	//readable and concise code
	//easier-to-use API and libraries
	//enables support for parallel processing
	
	//@FunctionalInterface add to custom functional interface
	
	//aBlockOfCode = public void perform(){   System.out.println("Hello World!);  }
	//aBlockOfCode = () -> {   System.out.println("Hello World!);  }
	
	//greetingFunction = () -> System.out.println("Hello World!);
	//doubleNumberFunction = (int a) -> a*2;            "return" can be skipped
	//addFunction = (int a, int b) -> a+b;
	
	/*safeDivideFunction = (int a, int b) -> {
	                                    if (b == 0) return 0;
	                                    return a/b;
	*/
	
	
	public static void main(String[] args) {
		
		MyLambda myLambdaFunction = () -> System.out.println("Hello World!");
		MyAdd addFunction = (int a, int b) -> a + b;
		
	}
	
	

}

interface MyLambda{
	void foo();
}

interface MyAdd{
	int add(int x, int y);
}
