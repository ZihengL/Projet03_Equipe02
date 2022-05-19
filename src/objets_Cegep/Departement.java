package objets_Cegep;

import objets_Membre.Enseignant;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Departement {

	private String departement;
	private Enseignant[] membres;

	/* CONSTRUCTEURS */

	/*
	 * 
	 */
	public Departement(String departement) {
		this.departement = departement;
	}

	/* GETTERS */

	public String getDepartement() {
		return departement;
	}

	public Enseignant[] getMembres() {
		return membres;
	}

	/* SETTERS */

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public void setMembres(Enseignant[] membres) {
		this.membres = membres;
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
