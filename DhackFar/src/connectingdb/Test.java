package connectingdb;

import java.sql.SQLException;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connectiontest ct = new Connectiontest(
				"C:\\Users\\megan\\OneDrive\\Documents\\GitHub\\EasyDhack\\EasyDhack\\auth.db");
		ct.connect();

		try {
			ct.setStatement(ct.getConnection().createStatement());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Random random = new Random();
		int q = random.nextInt(20);

		String query4 = "INSERT INTO Magazzino VALUES ('" + RandomStringUtils.randomAlphanumeric(10)
				+ "', 'Listerine', " + q + ", '15/03/2023')";

		try {
			ct.getStatement().executeQuery(query4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ct.close();

	}

}
