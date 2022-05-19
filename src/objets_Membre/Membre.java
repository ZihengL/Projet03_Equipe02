package objets_Membre;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public abstract class Membre {

	protected String nom;
	protected String code;

	/* CONSTRUCTEURS */

	/*
	 * 
	 */
	public Membre() {
		this("", "");
	}

	/*
	 * 
	 */
	public Membre(String nom, String code) {
		this.setNom(nom);
	}

	/* GETTERS */

	/*
	 * 
	 */
	public String getNom() {
		return nom;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	@Override
	public String toString() {
		return this.getNom();
	}
}
