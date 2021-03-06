package runner;

import java.sql.SQLException;

import dao.MovieDAO;
import dao.MoviePrepDAO;
import domain.Movie;

public class Runner {

	public static void main(String[] args) throws SQLException {

		MovieDAO dao = new MovieDAO();
		MoviePrepDAO prepDao = new MoviePrepDAO();
		
		Movie movieOne = new Movie(1, "Double Jeopardy", "Thriller", 7);
		Movie movieTwo = new Movie(2, "The Long Kiss Goodnight", "Action", 9);
		Movie movieThree = new Movie(3, "Shawshank redemption", "Thriller", 10);
		Movie movieFour = new Movie(4, "Titanic", "Drama", 9);
		Movie movieFive = new Movie(5,"Shrek", "Cartoon", 3);
		Movie movieSix = new Movie(6,"Shrek 2", "Cartoon", 2);
		Movie movieSeven = new Movie(7,"Seven", "Horror", 9);
		

		dao.create(movieOne);
		dao.create(movieTwo);
		dao.create(movieThree);
		dao.create(movieFour);
		

		prepDao.prepCreate(movieFive);
		prepDao.prepCreate(movieSix);
		prepDao.prepCreate(movieSeven);

		Movie changedMovie = new Movie("The Other Guys", "Comedy", 8);
		dao.update(changedMovie, 1);

		dao.delete(2);

		Movie movie2 = new Movie(2, "The Long Kiss Goodnight", "Action", 9);
		dao.create(movie2);

		System.out.println(dao.readAll());
		System.out.println(dao.readByLatest());
		System.out.println();
		
		for (int i=0; i<10; i++) {
			System.out.println(dao.readByRandom());
		}
		
		
		
		System.out.println();
		System.out.println(prepDao.prepReadById(1));
		System.out.println(prepDao.prepReadById(5));
	}

}
