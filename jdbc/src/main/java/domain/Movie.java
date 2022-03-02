package domain;

public class Movie {
	
	// attributes
	private int id;

	private String name;
	private String genre;
	private int rating;

	// default constructor
	public Movie() { };
	
	// all except id
	public Movie(String name, String genre, int rating) {
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	// all arguments constructor
	public Movie(int id, String name, String genre, int rating) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}
	// getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", rating=" + rating + "]";
	}
	
	

}
