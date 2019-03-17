package algor;

public class CountNumberChar {
	public static void main(String[] args) {
		  countChar("abbcaa");

		}

		public static void countChar(String str) {
		  for (int i = 0; i < str.length(); i++) {
		    int count = 1;
		    int idx = str.lastIndexOf(str.charAt(i));
		    for (int j = 0; j < idx; j++) {
		      if (str.charAt(j) == str.charAt(i))
		        count++;
		    }
		    // How couldn't I think about this simple check before print:
		    if(i == str.lastIndexOf(str.charAt(i)))
		      System.out.println(str.charAt(i) + ": " + count);
		  }
		}



}
