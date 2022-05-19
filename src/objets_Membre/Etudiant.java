package objets_Membre;

import utilitaires.Outils;

/*
 * Description: 
 *
 * Auteur: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 16/05/2022
 * V 1.0 
 */
public class Etudiant extends Membre {

	private static int nbEtudiants;

	private String code;

	/* CONSTRUCTEURS */

	/*
	 * 
	 */
	public Etudiant() {
		this("");
	}

	/*
	 * 
	 */
	public Etudiant(String nom) {
		super(nom);
		nbEtudiants++;
		this.setCode(Outils.genererCode(this) + "E");
	}

	/* GETTERS */

	/*
	 * 
	 */
	public static int getNbEtudiants() {
		return nbEtudiants;
	}

	/*
	 * 
	 */
	public String getCode() {
		return code;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public static void setNbEtudiants(int nbEtudiants) {
		Etudiant.nbEtudiants = nbEtudiants;
	}

	/*
	 * 
	 */
	public void setCode(String code) {
		this.code = code;
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
