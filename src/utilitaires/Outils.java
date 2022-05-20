package utilitaires;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Description: Classe qui contient toutes les méthodes concernant les fichiers de texte
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Outils {

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