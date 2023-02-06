package connectingdb;

import java.sql.ResultSet;
import java.sql.SQLException;

import prog.io.ConsoleInputManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsoleInputManager in = new ConsoleInputManager();
		System.out.println("Inserire nome utente: ");
		String nomeinserito = in.readLine();
		Connectiontest ct = new Connectiontest("C:\\Users\\megan\\OneDrive\\Documents\\GitHub\\EasyDhack\\EasyDhack");
		ct.connect();

		try {
			ct.setStatement(ct.getConnection().createStatement());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String query1 = "INSERT INTO auth VALUES ('Marco', 'Password')";

		try {
			ct.getStatement().execute(query1);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "SELECT * FROM auth";
		ResultSet rs = null;
		try {
			rs = ct.getStatement().executeQuery(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(rs);
	}

}
