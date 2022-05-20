package objets_Membre;

/*
 * Description: Classe qui simule un objet de type Enseignant
 *
 JTM ZI TU ES UN BO BONOME
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 16/05/2022
 * V 1.0 
 */
public class Enseignant extends Membre {

	private static int nbEnseignants;

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
		nbEnseignants++;
		this.setNom(nom);
		this.setCode();
		this.departement = departement;
	}

	/* GETTERS */

	/*
	 * 
	 */
	public String getDepartement() {
		return departement;
	}

	/*
	 * 
	 */
	public static int getNbEnseignants() {
		return nbEnseignants;
	}

	/* SETTERS */

	/*
	 * 
	 */
	@Override
	public void setCode() {
		super.setCode();
		this.code = this.getCode() + String.format("%04d", nbEnseignants) + "P";
	}

	/*
	 * 
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	/*
	 * 
	 */
	public static void setNbEnseignants(int nbEnseignants) {
		Enseignant.nbEnseignants = nbEnseignants;
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
