package Arrays;

public class ArrayLoops {

	public static int twoDArray[][] = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 } };

	public static void main(String[] args) {
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j]);
			}
			System.out.println();
		}
	}
}
