package algor;

public class ArrayClosestSum {
	


			
			public static void findClosest(int[] arr, int x) {
				
				
				int FirstIndex=0, SecondIndex=1;
				
				
				int distance=Integer.MAX_VALUE, sum=0;
					
				
				OUTER:
				for (int i = 0; i < arr.length; i++) {
					INNER:
					for (int j = 1; j < arr.length; j++) {
						sum=arr[i]+arr[j];
						
						//I found a closer match, assign new value to the distance, keep indexes of the numbers you found
						if(Math.abs(sum-x)<distance)
							{distance=Math.abs(sum-x);
							FirstIndex = i;
							SecondIndex= j;}
						
						
					}//end of inner
					
				}//end of outer
				
				System.out.println(" The closest pair is "+arr[FirstIndex]+" and "+ arr[SecondIndex]);
				
			}//end of method
			

			public static void main(String[] args) {
				
				int arr[] = {4,16, 28, 37, 42, 56, 63, 89, 124, 245}, x = 75;
		        
				//shorter, better, more efficient runtime of the algorithm , runtime of this nsquare
				
				findClosest(arr, x);  	
			

		}

	}

