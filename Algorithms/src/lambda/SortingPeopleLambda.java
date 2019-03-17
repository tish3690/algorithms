package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class SortingPeopleLambda {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Arnold", 39)
				);
		
		//Step 1: Sort List by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
		//Step 2: Create a method that prints all elements in the list
		printConditionally(people, p -> true);
		System.out.println("_________________");
		
		//Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("Last Name starts with \"C\"");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("First Name starts with \"C\"");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p))
				System.out.println(p);
		}
	}


}

