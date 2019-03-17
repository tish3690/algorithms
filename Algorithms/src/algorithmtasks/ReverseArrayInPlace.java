package algorithmtasks;

import java.util.Arrays;

public class ReverseArrayInPlace {
	
	public static String[] reverse(String[] array) { 
		
		if (array == null || array.length < 2) 	return array; 
		
		for (int i = 0; i < array.length / 2; i++) { 
			String temp = array[i]; 
			array[i] = array[array.length - 1 - i]; 
			array[array.length - 1 - i] = temp; 
			} 
		return array;
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"Adam", "John", "Mark"};
		System.out.println(Arrays.toString(reverse(arr)));
		
		
		
	}

	

}
