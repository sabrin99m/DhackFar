/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package persone;

import java.util.ArrayList;

import com.archetype.Package.Ordine;
import com.archetype.Package.Prodotto;
import com.archetype.Package.StatoOrdine;

// ----------- << imports@AAAAAAGFyqAZ/sdD2+M= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGFyqAZ/sdD2+M= >>
// ----------- >>
public class Fornitore {

	private String Nome;
	private ArrayList<Prodotto> ListaProdotti;
	private ArrayList<Ordine> ListaOrdini;
	private String codiceFornitore;

	public Fornitore(String Nome, ArrayList<Prodotto> listaProdotti, ArrayList<Ordine> listaOrdini,
			String codiceFornitore) {
		this.Nome = Nome;
		this.ListaProdotti = listaProdotti;
		this.ListaOrdini = listaOrdini;
		this.codiceFornitore = codiceFornitore;
	}

	// getters and setters
	public String getNome() {
		return Nome;
	}

	public ArrayList<Prodotto> getListaProdotti() {
		return ListaProdotti;
	}

	public ArrayList<Ordine> getListaOrdini() {
		return ListaOrdini;
	}

	public String getCodiceFornitore() {
		return codiceFornitore;
	}

	// methods
	public void confermaOrdine(Ordine ordine) {
		ordine.setStatoOrdine(StatoOrdine.CONFERMATO);
	}

	public void consegnaOrdine(Ordine ordine) {
		ordine.setStatoOrdine(StatoOrdine.CONSEGNATO);
	}

	public void inoltroOrdine(Ordine ordine) {
		ordine.setStatoOrdine(StatoOrdine.INOLTRATO);
	}

	public boolean checkDisponibilita(Ordine ordine) {
		boolean flag = false;
		ArrayList<Prodotto> lista = ordine.getListaProd();
		for (Prodotto prodotto : lista) {
			String codice = prodotto.getIDprodotto();
			int qta = prodotto.getQta();
			for (Prodotto prod : this.ListaProdotti) {
				if (prod.getIDprodotto() == codice && prod.getQta() <= qta)
					;
				flag = false;
			}
		}
		return flag;
	}

// ----------- << class.extras@AAAAAAGFyqAZ/sdD2+M= >>
// ----------- >>
}