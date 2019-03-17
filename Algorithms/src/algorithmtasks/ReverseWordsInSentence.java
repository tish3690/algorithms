package algorithmtasks;

public class ReverseWordsInSentence {

	static void reverseEachWordOfString(String str) {
		String[] words = str.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String reverseWord = "";
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + words[i].charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(str);
		System.out.println(reverseString);
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		
		reverseEachWordOfString("Java Concept Of The Day");

		reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

		reverseEachWordOfString("I am string not reversed");

		reverseEachWordOfString("Reverse Me");
	}

}
