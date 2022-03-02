package resultsRevisited;
//Not WOrking
public class Results {
	
	public static int physics = 97;
	public static int chemistry = 111;
	public static int biology = 101;
	
	public int total;
	public double percentage;
	
	public static double physicsPercentage = (double) (physics/150) * 100;
	
	public static double chemistryPercentage = (double) (chemistry/150) * 100;
	public static double biologyPercentage = (double) ((biology/150) * 100);
	
	public static int results(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		return total;	
	}
	
	public static double percentScore(int total) {
		double percentage = (total * 100) / 450;
		return percentage;	
	}
	
	public static void main(String[] args) {
		System.out.println(physicsPercentage);
		if (physicsPercentage < 60) {
			System.out.println("You have failed Physics & you have failed the Sciences");
		}
		
		if (chemistryPercentage < 60) {
			System.out.println("You have failed Chemistry & you have failed the Sciences");
		}
		
		if (biologyPercentage < 60) {
			System.out.println("You have failed Biology & you have failed the Sciences");
		}
		
		if (percentScore(results(physics, chemistry, biology)) < 60) {
			System.out.println("You have failed the Sciences");
		} else {
			System.out.println("You have passed the Sciences");
		}
	}

}

