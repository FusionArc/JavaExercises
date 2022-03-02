package task;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
	public List<Person> people = new ArrayList<Person>();
	
	public void searchPeeps(String p1) {
		this.people.stream().forEach(p -> {if (p.getName().equalsIgnoreCase(p1)) System.out.println(p);});		
	}
	
	public void displayAll() {
		for (Person P: people) {
			System.out.println(P);
			System.out.println("=".repeat(12));
		}
	}
	
}

