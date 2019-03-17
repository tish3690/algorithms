package algor;

import java.util.Arrays;

public class BinarySearch {

		
		public static int runBinarySearch( int[] sortedArray, int key, int left, int right) {
				    int index = Integer.MAX_VALUE;
				     
				    while (left <= right) {
				        int mid = (left + right) / 2;
				        if (sortedArray[mid] < key) {
				            left = mid + 1;
				        } else if (sortedArray[mid] > key) {
				            right = mid - 1;
				        } else if (sortedArray[mid] == key) {
				            index = mid;
				            break;
				        }
				    }
				    return index;
				}
		
		public static void main(String[] args) {
			
			
			int arr[] = {4,16, 28, 37, 42, 56, 63, 89, 124, 245};
			
			Arrays.sort(arr);
			System.out.println(Arrays.binarySearch(arr, 28));
	        
			System.out.println(runBinarySearch(arr, 89,0,12)); 
		}
	}


