/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.Package;

import java.util.ArrayList;

// ----------- << imports@AAAAAAGGDxl/kddqeIM= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGGDxl/kddqeIM= >>
// ----------- >>
public class DDT {

	private int numeroOrdine;
	private ArrayList<Prodotto> listaProdConsegnati;
	private int totale;

	public DDT(int numeroOrdine, ArrayList<Prodotto> lista) {
		this.numeroOrdine = numeroOrdine;
		this.listaProdConsegnati = lista;
		int tot = 0;
		for (Prodotto prodotto : lista) {
			tot = tot + prodotto.getQta();
		}
		this.totale = tot;
	}

	// gettersandsetters
	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public ArrayList<Prodotto> getListaProdConsegnati() {
		return listaProdConsegnati;
	}

	public int getTotale() {
		return totale;
	}

// ----------- << class.extras@AAAAAAGGDxl/kddqeIM= >>
// ----------- >>
}