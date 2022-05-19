package objets_Cegep;

import objets_Membre.Enseignant;
import objets_Membre.Etudiant;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Groupe {

	private static final int MAXETUDIANTS = 24;

	private Enseignant enseignant;
	private Etudiant[] etudiants;

	private String groupe;

	/* CONSTRUCTEURS */

	public Groupe() {
		this("", new Enseignant("", ""), new Etudiant[MAXETUDIANTS]);
	}

	public Groupe(String groupe, Enseignant enseignant, Etudiant[] etudiants) {
		this.groupe = groupe;
		this.enseignant = enseignant;
		this.setEtudiants(etudiants);
	}

	/* GETTERS */

	/* SETTERS */

	public void setEtudiants(Etudiant[] etudiants) {
		for (int i = 0; i < MAXETUDIANTS; i++) {

		}
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	@Override
	public String toString() {
		return "";
	}
}
