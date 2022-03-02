package task;

public class Runner {

	public static void main(String[] args) {
		
		// Instantiate list object
		PersonList pl = new PersonList();
		
		// Instantiate Person Objects
		Person personOne = new Person("David Barrow", 40, "Welder");
		Person personTwo = new Person("Kym Pilkington", 46, "Personal Assistant");
		Person personThree = new Person("Lawson Pilkington", 16, "Apprentice");
		
		// Add Person Objects to the PersonList object of pl
		pl.people.add(personOne);
		pl.people.add(personTwo);
		pl.people.add(personThree);
		
		
		// Print formatted object strings
		System.out.println(personThree.getName() + " is an " + personThree.getJobTitle());
		System.out.println("=".repeat(12));
		System.out.println(personTwo.getName() + " is " + personTwo.getAge() + " years old");
		System.out.println("=".repeat(12));
		System.out.println(personOne.getName() + " is currently a " + personOne.getJobTitle());
		System.out.println("=".repeat(12));
		
		// Print Size of list object
		System.out.println(pl.people.size());
		System.out.println("=".repeat(12));
		
		pl.searchPeeps("David Barrow");
		System.out.println("=".repeat(12));
		
		pl.displayAll();
	}
}
/*
 * 
 * Create a Person class modelling name, age and job title variables. #DONE
 * 
 * Create a method to return all three of these in a formatted string.
 * HINT: @Override the toString() method. # DONE
 * 
 * Create some example objects with this class. # DONE
 * 
 * Create a List<> implementation and store those objects inside. # DONE
 * 
 * HINT: it's probably best to put your List<> implementation in a separate
 * class.
 * 
 * Create a method that can search for a specific Person by their name.
 * 
 * Use a stream to output all of your people to the console.
 * 
 * HINT: you can iterate through collections using streams with forEach().
 * 
 */