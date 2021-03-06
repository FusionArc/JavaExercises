package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DatabaseConfig;
import domain.Movie;

public class MoviePrepDAO {

	//	private PreparedStatement preparedStatement;
	private Connection connection;

	public MoviePrepDAO() throws SQLException {
		try {
			this.connection = DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.username,
					DatabaseConfig.password);
			connection.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void prepCreate(Movie movie) {

		try {
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO movie (`name`, `genre`, `rating`) VALUES(?,?,?)");
			statement.setString(1, movie.getName());
			statement.setString(2, movie.getGenre());
			statement.setInt(3, movie.getRating());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ResultSet # required for read queries!
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		String genre = resultSet.getString("genre");
		int rating = resultSet.getInt("rating");

		return new Movie(id, name, genre, rating);
	}

	// Prepared Read by ID
	public Movie prepReadById(int id) {
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM movie WHERE id = ?");
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			return movieFromResultSet(resultSet);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// Update prepared statement
		public void updatePrepared(Movie movie, int id) {
			try {
				PreparedStatement statement = connection
						.prepareStatement("UPDATE movie set name = ?, genre = ?, rating = ? WHERE id = ?");
				statement.setString(1, movie.getName());
				statement.setString(2, movie.getGenre());
				statement.setInt(3, movie.getRating());
				statement.setInt(4, id);
				statement.executeUpdate();
				
				System.out.println(prepReadById(id));
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		// Delete prepared statement
		public void deletePrepared(int id) {
			try {
				PreparedStatement statement = connection.prepareStatement("DELETE FROM movie WHERE id = ?");
				
				statement.setInt(1, id);
				statement.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}
