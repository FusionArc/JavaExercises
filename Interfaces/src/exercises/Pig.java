package exercises;

public class Pig implements Animal {
	@Override
	public void sound() {
		System.out.println("The pig says: Oink");
	}

	@Override
	public void sleep() {
		System.out.println("Zzz");
	}
}
