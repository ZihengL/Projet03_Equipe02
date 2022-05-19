package objets_Membre;

import utilitaires.Outils;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 16/05/2022
 * V 1.0 
 */
public class Enseignant extends Membre {

	private static int nbEnseignants;

	private String code;
	private String departement;

	/* CONSTRUCTEURS */

	/*
	 * 
	 */
	public Enseignant() {
		this("", "");
	}

	/*
	 * 
	 */
	public Enseignant(String nom, String departement) {
		super(nom);
		nbEnseignants++;
		this.setCode(Outils.genererCode(this) + "P");
		this.departement = departement;
	}

	/* GETTERS */

	/*
	 * 
	 */
	public String getCode() {
		return code;
	}

	/*
	 * 
	 */
	public static int getNbEnseignants() {
		return nbEnseignants;
	}

	/*
	 * 
	 */
	public String getDepartement() {
		return departement;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public static void setNbEnseignants(int nbEnseignants) {
		Enseignant.nbEnseignants = nbEnseignants;
	}

	/*
	 * 
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/*
	 * 
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
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
