package task;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
	public static List<Person> people = new ArrayList<Person>();
	
	public void searchPeeps(String p1) {
		PersonList.people.stream().forEach(p -> p.getName());		
	}

}

