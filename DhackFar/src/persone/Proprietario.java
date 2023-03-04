/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package persone;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.lang.RandomStringUtils;

import connectingdb.Connectiontest;

// ----------- << imports@AAAAAAGFyo3C16vtYQ0= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGFyo3C16vtYQ0= >>
// ----------- >>
public class Proprietario extends User {

	private ArrayList<Fornitore> listaFornitori;
	private ArrayList<Dipendente> listaDipendenti;

	// singleton pattern
	private static Proprietario uniqueProprietario;

	private Proprietario(String UserID, String Nome, String Cognome, String Password,
			ArrayList<Fornitore> listaFornitori, ArrayList<Dipendente> listaDipendenti) {
		super(UserID, Nome, Cognome, Password);
		this.listaFornitori = listaFornitori;
		this.listaDipendenti = listaDipendenti;
	}

	public static synchronized Proprietario getProprietario(String UserID, String Nome, String Cognome, String Password,
			ArrayList<Fornitore> listaFornitori, ArrayList<Dipendente> listaDipendenti) {
		if (uniqueProprietario == null) {
			uniqueProprietario = new Proprietario(UserID, Nome, Cognome, Password, listaFornitori, listaDipendenti);
		}
		return uniqueProprietario;
	}

	public ArrayList<Fornitore> getListaFornitori() {
		return listaFornitori;
	}

	public ArrayList<Dipendente> getListaDipendenti() {
		return listaDipendenti;
	}

	public void assignPassword(Dipendente dipendente) {
		dipendente.setPassword(RandomStringUtils.randomAlphanumeric(10));
	}

	public void addFornitore(Fornitore fornitore) {
		listaFornitori.add(fornitore);
	}

	public void assumiDipendente(String Nome, String Cognome) {
		Dipendente dipendente = new Dipendente(Nome + RandomStringUtils.randomAlphanumeric(4), Nome, Cognome, null);
		assignPassword(dipendente);
		listaDipendenti.add(dipendente);

		Connectiontest ct = new Connectiontest(
				"C:\\Users\\megan\\OneDrive\\Documents\\GitHub\\EasyDhack\\DhackFar\\localdb.db");
		ct.connect();

		try {
			ct.setStatement(ct.getConnection().createStatement());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "INSERT INTO auth VALUES ('" + dipendente.getUserID() + "', '" + dipendente.getPassword() + "')";
		try {
			ct.getStatement().execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ct.close();
	}
// ----------- << class.extras@AAAAAAGFyo3C16vtYQ0= >>
// ----------- >>

}