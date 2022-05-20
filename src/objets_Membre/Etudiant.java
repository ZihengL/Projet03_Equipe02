package objets_Membre;

/*
 * Description: Classe qui simule un objet de type Etudiant
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
		nbEtudiants++;
		this.setCode();
	}

	/* GETTERS */

	/*
	 * 
	 */
	public static int getNbEtudiants() {
		return nbEtudiants;
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
	@Override
	public void setCode() {
		super.setCode();
		this.code = this.getCode() + String.format("%04d", nbEtudiants) + "E";
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}
