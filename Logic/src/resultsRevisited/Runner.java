package resultsRevisited;

public class Runner {
	
	public static resultsRevisited.Results rr = new Results();

	public static void main(String[] args) {
		System.out.println("Physics:    " + Results.physics + "/150");
		System.out.println("Chemistry:  " + Results.chemistry + "/150");
		System.out.println("Biology:    " + Results.biology + "/150");
		System.out.println("====================");
		System.out.println("Total:      " + Results.results(Results.physics, Results.chemistry, Results.biology) + "/450");
		System.out.println("====================");
		System.out.println("Percentage: " + Results.percentScore(Results.results(Results.physics, Results.chemistry, Results.biology)) + "%");
		
	}

}
