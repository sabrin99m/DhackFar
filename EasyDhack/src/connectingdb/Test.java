package connectingdb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

		ResultSet rs = null;

		String query4 = "SELECT Nome FROM auth";

		try {
			rs = ct.getStatement().executeQuery(query4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<String> nomi = new ArrayList<>();

		try {
			while (rs.next()) {
				nomi.add(rs.getString("Nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(nomi);
	}

}
