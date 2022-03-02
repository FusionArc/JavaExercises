package Arrays;

public class ArrayExercise2 {

	public static void main(String[] args) {
		
		int[] loopArray = new int[10];
		for(int i=0; i < loopArray.length; i++) {
			loopArray[i] = i;
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=0; i < loopArray.length; i++) {
			loopArray[i] = i;
			System.out.println(i*10);
		}
	}
}