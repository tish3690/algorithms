package algor;

public class NumberCharInString {
	
	public static int CharOccurence(String s, char c) {//"java mentoring session.., j"
		
		int count=0;
		
		while(s.indexOf(c)!=-1)
		{
			count++;//count=1, counted first j//count=2, 
			s=s.substring(s.indexOf(c)+1);//ava mentoring session//mentoring session
		}
		
		
		return count;}
    
	public static void FreqChar(String str)
    {
    	str=str.replace(" ", "");
    	
      while(str.length()>0){
		
    	 char ch= str.charAt(0);
    	 
    	 System.out.println("Number of Occurrence of "+ ch +" is: "+CharOccurence(str, ch));//i searched for js, i found 2 js 
    	//java mentoring session thursday!
    	 
    	 str=str.replace(""+ch, "");//new string is remove all js, look for other characters
    	 //ava mentoring session thursday!
    	 //v mentoring session thursday!
	}
    	
    	
    }
    public static void main(String[] args)
    {
        
        String str = "java mentoring session thursday!";
        FreqChar(str);
    }
}
