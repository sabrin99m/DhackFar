/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package uml.Package1;

import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGFyqiDhcnqoqI= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAGFyqiDhcnqoqI= >>
// ----------- >>
public class ListaFornitori {
    // ----------- << attribute.annotations@AAAAAAGFyqp+G82YOuk= >>
    // ----------- >>
    private ArrayList ListaFornitori;

    // ----------- << attribute.annotations@AAAAAAGFyqj/JspDmQA= >>
    // ----------- >>
    private Set<Fornitore>  = new HashSet<>();

    public ArrayList getListaFornitori() {
        return ListaFornitori;
    }

    public Set<Fornitore> get() {
        return ;
    }

    public void setListaFornitori(ArrayList ListaFornitori) {
        this.ListaFornitori = ListaFornitori;
    }

    public void link(Fornitore _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
            get().add(_);
        }
    }

    public void unlink(Fornitore _) {
        if (_ != null) {
            _.set(null);
            get().remove(_);
        }
    }

    public void unlink(Fornitore _, Iterator<Fornitore> it) {
        if (_ != null) {
            _.set(null);
            it.remove();
        }
    }

// ----------- << class.extras@AAAAAAGFyqiDhcnqoqI= >>
// ----------- >>
}