package algorithmtasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	//No Collection
	static void removeDuplicates(int[] arr) {
		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// Assuming all elements in input array are unique
		int n = arr.length;
		
		// Comparing each element with all other elements
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				
				// If any two elements are found equal
				if (arr[i] == arr[j]) {
					// Replace duplicate element with last unique element
					arr[j] = arr[n - 1];
					n--;
					j--;
				}
			}
		}

		// Copying only unique elements of my_array into array1
		int[] array1 = Arrays.copyOf(arr, n);

		// Printing arrayWithoutDuplicates
		System.out.println();

		System.out.println("Array with unique values : ");

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}

		System.out.println();

		System.out.println("---------------------------");
	}
	
	//Collection
	static void removeDupsCol(String[] arr) {
		System.out.println("Original array: " + Arrays.toString(arr));

	    List<String> list = Arrays.asList(arr);
	    Set<String> set = new HashSet<String>(list);

	    String[] result = new String[set.size()];
	    set.toArray(result);
	    
	    System.out.println("No Duplicates array: " + Arrays.toString(result));	  
	}

	
	
	public static void main(String[] args) {
		removeDuplicates(new int[] { 0, 3, -2, 4, 3, 2, 2 });

		removeDupsCol(new String[] { "Adam", "Bob", "Adam", "Steve", "John", "Steve" });

	}

}
