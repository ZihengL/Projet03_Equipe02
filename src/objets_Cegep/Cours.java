package objets_Cegep;

import objets_Membre.Enseignant;
import objets_Membre.Etudiant;
import objets_Membre.Membre;
import utilitaires.Tableaux;

/*
 * Description: Classe qui simule un objet de type Cours
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Cours {

	private int sigle;
	private String cours;
	private Groupe[] groupes;
	private Membre[] membres;

	/* CONSTRUCTEURS */

	/*
	 * 
	 */
	public Cours() {
		this(0, "", new Membre[0]);
	}

	/*
	 * 
	 */
	public Cours(int sigle, String cours, Membre[] membres) {
		this.sigle = sigle;
		this.cours = cours;
		this.setMembres(membres);

		this.groupes = new Groupe[0];
	}

	/* GETTERS */

	/*
	 * 
	 */
	public int getSigle() {
		return this.sigle;
	}

	/*
	 * 
	 */
	public String getCours() {
		return this.cours;
	}

	/*
	 * 
	 */
	public Groupe[] getGroupes() {
		return this.groupes;
	}

	/*
	 * 
	 */
	public Membre[] getMembres() {
		return this.membres;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public void setSigle(int sigle) {
		this.sigle = sigle;
	}

	/*
	 * 
	 */
	public void setCours(String cours) {
		this.cours = cours;
	}

	/*
	 * 
	 */
	public void setGroupes(Groupe[] groupes) {
		this.groupes = groupes;
	}

	/*
	 * 
	 */
	public void setMembres(Membre[] membres) {
		this.membres = membres;
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	public void ajouterMembre(Membre membre) {
		Tableaux.incrementerTableau(this.membres, membre);
	}

	/*
	 * 
	 */
	public void ajouterGroupe(int groupe, Enseignant enseignant, Etudiant[] etudiants) {
		Tableaux.incrementerTableau(this.groupes, new Groupe(groupe, enseignant, etudiants));
	}

	/*
	 * 
	 */

	/*
	 * 
	 */
	@Override
	public String toString() {
		return "";
	}

}
