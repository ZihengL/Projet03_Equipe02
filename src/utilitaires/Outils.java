package utilitaires;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	public static void chargerDepartements(String[] departements) throws FileNotFoundException, IOException {
		BufferedReader entree = new BufferedReader(new FileReader("/src/enums/departements.txt"));
		String ligne = entree.readLine();

		departements = new String[0];
		while (ligne != null) {
			Tableaux.incrementerTableau(departements, ligne);
			ligne = entree.readLine();
		}
		entree.close();
	}
}