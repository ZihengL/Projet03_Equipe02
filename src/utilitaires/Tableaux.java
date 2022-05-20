package utilitaires;

import java.util.Arrays;

import objets_Membre.Membre;

/*
 * Description: 
 *
 * Auteur: Zi heng Liu
 * Date: 19/05/2022
 * V 1.0 
 */
public class Tableaux {

	/*
	 * 
	 */
	public static void incrementerTableau(Object[] tableau, Object objet) {
		if (objet.getClass() == tableau.getClass()) {
			tableau = Arrays.copyOf(tableau, tableau.length + 1);
			tableau[tableau.length - 1] = objet;
		}
	}

	/*
	 * 
	 */
	public static void unifierMembres(Membre[] primaire, Membre[] secondaire) {
		for (int i = 0; i < secondaire.length; i++)
			if (secondaire[i] != null)
				Tableaux.incrementerTableau(primaire, secondaire[i]);
	}

}
