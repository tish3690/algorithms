package algorithmtasks;

import java.util.Arrays;

public class BinarySearch {
	
	public static int performBinarySearch(int[] arr, int n) { 
		int low = 0; 
		int high = arr.length - 1; 
		int middle = 0;
		
		while (low <= high) { 
			middle = (low + high) / 2; 
			
			if (arr[middle] < n) { 
				low = middle + 1; 
			}else if (arr[middle] > n) { 
				high = middle - 1;
			}else {
				return middle;
			}
		}
		return -1;
		
	} 
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 1, 8, 12, 35, 11, 7, 6, 3};
		
		Arrays.sort(arr);
		
		System.out.println(performBinarySearch(arr, 11)); 
		
		System.out.println(Arrays.binarySearch(arr, 3));
		
	}

	

}
