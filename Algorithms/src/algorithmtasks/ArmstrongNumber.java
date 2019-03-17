package algorithmtasks;

public class ArmstrongNumber {
	
	public static boolean isArmstrongNumber(int n) {
		int c = 0, a = 0;  
	    int temp=n;  
	    while(n > 0)  {  
	    	a = n%10;  
	    	n = n/10;  
	    	c = c + (a*a*a);  
	    }  
	    if(temp==c) return true;   
	    else return false;
	}
	
	public static void main(String[] args)  {  
		
	    System.out.println(isArmstrongNumber(371));
	}
}
