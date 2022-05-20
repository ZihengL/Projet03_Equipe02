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
<<<<<<< Updated upstream
		this("", new Enseignant("", ""), new Etudiant[MAXETUDIANTS]);
=======
		this("", new Enseignant(), new Etudiant[0]);
>>>>>>> Stashed changes
	}

	public Groupe(String groupe, Enseignant enseignant, Etudiant[] etudiants) {
		this.groupe = groupe;
<<<<<<< Updated upstream
		this.enseignant = enseignant;
		this.setEtudiants(etudiants);
=======
>>>>>>> Stashed changes
	}

	/* GETTERS */

<<<<<<< Updated upstream
=======
	public String getGroupe() {
		return this.groupe;
	}

	public int getNbEtudiants() {
		return this.nbEtudiants;
	}

	public Enseignant getEnseignant() {
		for (Membre membre : this.membres)
			if (membre instanceof Enseignant)
				return (Enseignant) membre;

		return null;
	}

	public Etudiant[] getEtudiants() {
	}

>>>>>>> Stashed changes
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
