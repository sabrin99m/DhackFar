/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.Package;

import java.util.ArrayList;

// ----------- << imports@AAAAAAGGDNKuMUyI98s= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGGDNKuMUyI98s= >>
// ----------- >>
public class Magazzino {

	private ArrayList<Prodotto> ListaProdotti;
	private String owner;
	private ArrayList<Ordine> listaOrdini;

	public Magazzino(ArrayList<Prodotto> ListaProdotti, String owner, ArrayList<Ordine> listaOrdini) {
		this.ListaProdotti = ListaProdotti;
		this.owner = owner;
		this.listaOrdini = listaOrdini;
	}

	public ArrayList<Prodotto> getListaProdotti() {
		return ListaProdotti;
	}

	public String getOwner() {
		return owner;
	}

	public ArrayList<Ordine> getListaOrdini() {
		return listaOrdini;
	}

// ----------- << class.extras@AAAAAAGGDNKuMUyI98s= >>
// ----------- >>
}