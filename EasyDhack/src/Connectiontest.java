
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectiontest {

	private String pathDB = "C:\\Users\\megan\\Downloads\\sqlite\\sqlite\\auth.db";
	private Connection connection = null;
	private Statement statement = null;

	public Connectiontest(String path) {
		pathDB = path;

	}

	public void connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:" + pathDB);
			statement = connection.createStatement();
			System.out.println("Connection to " + pathDB + " " + "successful");

		} catch (ClassNotFoundException notFoundException) {
			notFoundException.printStackTrace();
			System.out.println("Connection Error!");

		} catch (SQLException sqlException) {

			sqlException.printStackTrace();
			System.out.println("Connection Error!");
		}
	}

	public void close() {
		try {
			connection.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}