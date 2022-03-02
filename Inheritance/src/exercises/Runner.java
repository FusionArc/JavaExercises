package exercises;

public class Runner {

	public static void main(String[] args) {
		Bird birdFriend = new Bird();
		Owl owlfriend = new Owl();
		
		
		owlfriend.doThing();
		owlfriend.noise();		// will return "tweet", because Owl extends Bird!

		System.out.println(birdFriend.getFly());
	}

}
