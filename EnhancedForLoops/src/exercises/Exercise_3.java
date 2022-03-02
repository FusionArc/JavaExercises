package exercises;

public class Exercise_3 {
	
	public static boolean x(int y) {
		if (y % 2 == 0) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(x(15));
	}

}

// Create a method that returns a boolean and accepts an integer as a parameter, 
// if the integer is even, return true,
// if not then return false.