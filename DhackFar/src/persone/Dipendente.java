/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package persone;

import com.archetype.Package.DDT;
import com.archetype.Package.Magazzino;
import com.archetype.Package.Prodotto;

public class Dipendente extends User {

	public Dipendente(String UserID, String Nome, String Cognome, String Password) {
		super(UserID, Nome, Cognome, Password);
	}

	public void InserisciDDT(DDT ddt, Magazzino m) {
		for (Prodotto prodotto : ddt.getListaProdConsegnati()) {
			for (Prodotto p : m.getListaProdotti()) {
				if (prodotto.getIDprodotto() == p.getIDprodotto()) {
					p.setQta(p.getQta() + prodotto.getQta());
				} else {

				}
			}
		}

	}
// ----------- << class.extras@AAAAAAGFyo0wz6uwd1E= >>
// ----------- >>

}