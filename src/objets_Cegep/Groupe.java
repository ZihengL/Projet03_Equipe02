package objets_Cegep;

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
public class Groupe {

	private static final int MAXETUDIANTS = 24;

	private Membre[] membres;
	private String groupe;
	private int nbEtudiants;

	/* CONSTRUCTEURS */

	public Groupe() {
		this("", new Enseignant("", ""), new Membre[MAXETUDIANTS + MAXENSEIGNANTS]);
	}

	public Groupe(String groupe, Membre[] membres) {
		this.groupe = groupe;
		this.setEtudiants(etudiants);
	}

	/* GETTERS */

	public String getGroupe() {
		return this.groupe;
	}

	public Enseignant getEnseignant() {
		for (Membre membre : this.membres)
			if (membre instanceof Enseignant)
				return (Enseignant) membre;

		return null;
	}

	public Etudiant[] getEtudiants() {

	}

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
