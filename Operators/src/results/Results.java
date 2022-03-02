package results;
//Working
public class Results {
	
	public static int physics = 97;
	public static int chemistry = 111;
	public static int biology = 101;
	
	public int total;
	public double percentage;
	
	public static int results(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		return total;	
	}
	
	public static double percentScore(int total) {
		double percentage = (total * 100) / 450;
		return percentage;	
	}


	public static void main(String[] args) {
		
		System.out.println("Physics:    " + physics + "/150");
		System.out.println("Chemistry:  " + chemistry + "/150");
		System.out.println("Biology:    " + biology + "/150");
		System.out.println();
		System.out.println("Total:      " + results(physics, chemistry, biology) + "/450");
		System.out.println();
		System.out.println("Percentage: " + percentScore(results(physics, chemistry, biology)) + "%");

	}
	
}


// Results:
// A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. 
// When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
// Create the results class, this class has 5 variables, 
// Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
//
// Method 1 - displays the results that the person got for each exam and then the total mark.
// Try to make the output neat and bespoke for each exam.
// Method 2 - which finds and displays the percentage that the person received for the exams overall.