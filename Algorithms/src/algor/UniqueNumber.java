package algor;

import java.util.ArrayList;

public class UniqueNumber {
	
	public static void main(String[] args) {
	int[] arr = new int[] { 1, 2,6,6,4, 3, 1, 2, 3, 4, 5 };

	ArrayList<Integer> unique = new ArrayList<>();

	 opp: for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {

			if (arr[i] == arr[j] && i != j) {
				continue opp;

			} 

		}
		unique.add(arr[i]);
	}
	System.out.println(unique.toString());
}
}
