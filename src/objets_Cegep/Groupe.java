package objets_Cegep;

import java.util.Arrays;

import objets_Membre.Enseignant;
import objets_Membre.Etudiant;
import objets_Membre.Membre;

/*
 * Description: Classe qui simule un objet de type Groupe
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Groupe {

	private static final int MAXETUDIANTS = 24;

	private int groupe;
	private Enseignant enseignant;
	private Etudiant[] etudiants;

	private int nbEtudiants;

	/* CONSTRUCTEURS */

	public Groupe() {
		this(0, new Enseignant(), new Etudiant[0]);
	}

	/*
	 * 
	 */
	public Groupe(int groupe, Enseignant enseignant, Etudiant[] etudiants) {
		this.groupe = groupe;
		this.setEtudiants(etudiants);

	}

	/* GETTERS */

	public int getGroupe() {
		return this.groupe;
	}

	/*
	 * 
	 */
	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	/*
	 * 
	 */
	public Etudiant[] getEtudiants() {
		return this.etudiants;
	}

	public int getNbEtudiants() {
		return this.nbEtudiants;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public void setEtudiant() {

	}

	/*
	 * NOTE: BUGGED
	 */
	public void setEtudiants(Etudiant[] etudiants) {
		this.etudiants = Arrays.copyOf(this.etudiants, MAXETUDIANTS);
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	public void ajouterMembres(Membre... membre) {
	}

	/*
	 * 
	 */
	public void retirerMembres(Membre... membre) {

	}

	/*
	 * 
	 */
	@Override
	public String toString() {
		return "";
	}
}
