package utilitaires;

import java.util.Arrays;

import objets_Membre.Enseignant;
import objets_Membre.Etudiant;
import objets_Membre.Membre;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Outils {

	/*
	 * 
	 */
	public static String genererCode(Membre individu) {
		String nom = individu.getNom();

		return nom.substring(0, (nom.length() < 3 ? nom.length() : 3)).toUpperCase()
				+ "XXX".substring(0, (3 - nom.length() < 0 ? 0 : 3 - nom.length()))
				+ String.format("%04d", individu instanceof Etudiant ? Etudiant.getNbEtudiants()
						: Enseignant.getNbEnseignants());
	}

	/*
	 * 
	 */
	public static void ajouterObjet(Object[] tableau, Object objet) {
		if (objet.getClass() == tableau.getClass())
			tableau = Arrays.copyOf(tableau, tableau.length + 1);
		tableau[tableau.length - 1] = objet;
	}
}