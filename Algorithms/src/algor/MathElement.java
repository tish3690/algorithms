package algor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathElement {
public static void main(String[] args) throws IOException{
		
//		Scanner sc = new Scanner(System.in);
//		Scanner ss = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		String sb = br.readLine();
		
		String[] arr = sb.split(" ");
		
		if(arr.length <  m || arr.length > m) {
			System.out.println("NIL");
		}else {
			System.out.println(arr[arr.length-m]);
		 }
		
	}
}

