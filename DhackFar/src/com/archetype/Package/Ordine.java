/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.Package;

import java.util.ArrayList;

// ----------- << imports@AAAAAAGGDN+HnGAdIAc= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGGDN+HnGAdIAc= >>
// ----------- >>
public class Ordine {

	private int numeroOrdine;
	private String codiceFornitore;
	private int totaleqta;
	private ArrayList<Prodotto> listaProd;
	private StatoOrdine statoOrdine;

	public Ordine(int numeroOrdine, String codiceFornitore, ArrayList<Prodotto> listaProd) {
		this.numeroOrdine = numeroOrdine;
		this.codiceFornitore = codiceFornitore;
		this.listaProd = listaProd;
		int tot = 0;
		for (Prodotto prodotto : listaProd) {
			tot = tot + prodotto.getQta();
		}
		this.totaleqta = tot;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public String getCodiceFornitore() {
		return codiceFornitore;
	}

	public int getTotaleqta() {
		return totaleqta;
	}

	public ArrayList<Prodotto> getListaProd() {
		return listaProd;
	}

	public StatoOrdine getStatoOrdine() {
		return statoOrdine;
	}

	public void setStatoOrdine(StatoOrdine statoOrdine) {
		this.statoOrdine = statoOrdine;
	}

// ----------- << class.extras@AAAAAAGGDN+HnGAdIAc= >>
// ----------- >>
}