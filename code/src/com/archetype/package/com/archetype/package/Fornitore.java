/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.Package;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGFyqAZ/sdD2+M= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGFyqAZ/sdD2+M= >>
// ----------- >>
public class Fornitore extends Personale {
    // ----------- << attribute.annotations@AAAAAAGFyqyfPNAVKdQ= >>
    // ----------- >>
    private String Nome;

    // ----------- << attribute.annotations@AAAAAAGFyqzcZ9BY1n0= >>
    // ----------- >>
    private ArrayList ListaProdotti;

    // ----------- << attribute.annotations@AAAAAAGFyq1O7dDqDBk= >>
    // ----------- >>
    private ArrayList ListaOrdini;

    // ----------- << attribute.annotations@AAAAAAGFz/ThbA8y9/I= >>
    // ----------- >>
    private User ;

    // ----------- << attribute.annotations@AAAAAAGFyqj/JspEGYM= >>
    // ----------- >>
    private ListaFornitori ;

    public String getNome() {
        return Nome;
    }

    public ArrayList getListaProdotti() {
        return ListaProdotti;
    }

    public ArrayList getListaOrdini() {
        return ListaOrdini;
    }

    public User get() {
        return ;
    }

    public ListaFornitori get() {
        return ;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setListaProdotti(ArrayList ListaProdotti) {
        this.ListaProdotti = ListaProdotti;
    }

    public void setListaOrdini(ArrayList ListaOrdini) {
        this.ListaOrdini = ListaOrdini;
    }

    public void set(User ) {
        this. = ;
    }

    public void set(ListaFornitori ) {
        this. = ;
    }

    public void link(User _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(ListaFornitori _) {
        if (_ != null) {
            _.get().add(this);
        }

        unlink();
        set(_);
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }

    // ----------- << method.annotations@AAAAAAGFyqwSIM995lY= >>
    // ----------- >>
    public void confermaOrdine() {
    // ----------- << method.body@AAAAAAGFyqwSIM995lY= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAGFyqxeUc/S9LM= >>
    // ----------- >>
    public void consegnaOrdine() {
    // ----------- << method.body@AAAAAAGFyqxeUc/S9LM= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAGFz/GojAxVLWQ= >>
    // ----------- >>
    public void checkDisponibilità() {
    // ----------- << method.body@AAAAAAGFz/GojAxVLWQ= >>
    // ----------- >>
    }
    // ----------- << method.annotations@AAAAAAGFz/goWRUaKZo= >>
    // ----------- >>
    public void inoltroOrdine() {
    // ----------- << method.body@AAAAAAGFz/goWRUaKZo= >>
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAGFyqAZ/sdD2+M= >>
// ----------- >>
}