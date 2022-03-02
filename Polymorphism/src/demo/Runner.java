package demo;

public class Runner {

	public static void main(String[] args) {
		Cow cow = new Cow();
		Animal animal = new Cow();
		Object object = new Cow();
		
		
		System.out.println("=============Cow=============");
        cow.speak();
        cow.sleep();
        System.out.println("=============================");
        
        System.out.println("============Animal===========");
        ((Cow) animal).speak();
        animal.sleep();
        System.out.println("=============================");
        
        System.out.println("============Object===========");
        ((Cow) object).speak();
        ((Cow) object).sleep();
        System.out.println("=============================");

	}

}


// https://qa-community.co.uk/~/_/learning/java-beginner/java--polymorphism