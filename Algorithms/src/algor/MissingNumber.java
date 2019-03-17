package algor;

import java.util.ArrayList;

public class MissingNumber {
	
	public static void main(String[] args) {
		int []arr=new int [] {1,2,3,4,5,47,67,78,100};

		ArrayList <Integer>miss=new ArrayList();
		int j=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(j==arr[i]) {
				j++;
				continue;
			}else {
				miss.add(j);
				i--;
				j++;
				
			}
				
			}
		System.out.println("Missing number");
		for(int i:miss) {
			System.out.print(" "+ i);
		}
				
				
				
				
			}


}
