package calcRevisited;

/*
Edit the division method in the Calculator class, 
the sum should only execute if the first parameter is smaller than the second, 
otherwise it prints out a message saying that the division cannot be performed.
*/

public class Runner {

	public static double division(int i, int j) {
		if (i > j) {
			return (double) i / j;
		} else {
			return (double) 0;
		}
	}

	
	public static void main(String[] args) {
		System.out.println(division(100,25));
	}
	
}
