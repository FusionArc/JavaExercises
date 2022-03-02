package Arrays;

public class ForEach {
	
	public static int votes[] = {1, 1, 2, 1, 3};

    public static void process(int vote) {
        System.out.println(vote);
    }

    public static void main(String[] args) {
        for(int vote : votes) {
            process(vote);
        }
    }

}
