package exercises;

public class Exercise_4 {

	public static void main(String[] args) {
		int[] intArr = new int[20];
		for (int i = 1; i < intArr.length; i++) {
			intArr[i] = i;
			if (Exercise_3.x(i) == true) {
				System.out.println(i * i * i);
			} else {
				System.out.println(i * i);
			}
		}

	}
}

//Using the array of integers from exercise 2 and the method created in exercise 3; 
//iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.
//
//If the value is even, cube it, then print it to console.
//If the value is odd, square it, then print it to console.