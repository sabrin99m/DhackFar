import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectingdb.Connectiontest;
import connectingdb.connectingonline;
import persone.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User utente = new User("Marco", "Password");
		ArrayList<String> stringid = utente.listaIDProdotti();

		// accesso a db ordini online per scaricare id e quantità prodotti consegnati e
		// impostare lo stato a consegnato

		connectingonline ct = new connectingonline("//127.0.0.1:3306/ordini");
		ct.connect();

		try {
			ct.setStatement(ct.getConnection().createStatement());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String queryconsegna = "UPDATE ordini SET Stato='CONSEGNATO' WHERE NumeroOrdine=9812763450";
		try {
			ct.getStatement().executeUpdate(queryconsegna);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultSet resultSet = null;
		String query = "SELECT IDProdotto, Qty FROM ordini WHERE NumeroOrdine=9812763450";
		try {
			resultSet = ct.getStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// accesso a db magazzino locale per aggiornare le quantità dei corrispondenti
		// id, se non esiste si crea nuovo prodotto

		Connectiontest ct1 = new Connectiontest(
				"C:\\Users\\megan\\OneDrive\\Documents\\GitHub\\EasyDhack\\DhackFar\\localdb.db");
		ct1.connect();

		try {
			ct1.setStatement(ct1.getConnection().createStatement());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			while (resultSet.next()) {
				if (stringid.contains(resultSet.getString(1))) {
					String update = "UPDATE Magazzino SET Quantità=Quantità+" + resultSet.getString(2)
							+ " WHERE ProdottoID='" + resultSet.getString(1) + "'";
					// ct1.getStatement().executeUpdate(update);
				} else {
					String nomescelto = utente.sceglinome();
					String datacasuale = utente.datacasuale();
					String insert = "INSERT INTO Magazzino VALUES ('" + resultSet.getString(1) + "', '" + nomescelto
							+ "', " + resultSet.getInt(2) + ", '" + datacasuale + "')";

					ct1.getStatement().executeUpdate(insert);
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ct.close();
		ct1.close();

	}

}
