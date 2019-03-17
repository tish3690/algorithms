package algor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UncoupledInteger {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine(); // 1, 2, 3, 44, 1, 2, 3
		
		String[] nums = n.split(", ");
		List<String> numbers = new ArrayList<>();
		
LABEL1:		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i != j && nums[i].equals(nums[j])) {
					continue LABEL1;
				}
			}
			numbers.add(nums[i]);
		}
		//System.out.println(numbers);
		for(String each: numbers) {
			System.out.println(each);
		}

	}

}


