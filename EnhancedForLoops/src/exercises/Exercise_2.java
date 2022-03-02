package exercises;

public class Exercise_2 {

	public static void main(String[] args) {
		int[] intArr = new int[20];
		for(int i=1; i < intArr.length; i++) {
			intArr[i] = i;
			System.out.println(i*i);
		}
	}

}

// Create an array of integers 1-20 
// and iterate through it, using an enhanced for loop, 
// square, and then print each value.