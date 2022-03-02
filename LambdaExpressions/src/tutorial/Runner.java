package tutorial;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Cheese");
		words.add("Pizza");
		words.add("Burger");
		words.add("Sandwich");
		words.add("Kebab Roll");
		
		words.forEach(word -> System.out.println(word));
		
	}

}
