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

	/* GETTERS */

	/*
	 * 
	 */
	public String getNom() {
		return nom;
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
	public void setNom(String nom) {
		this.nom = nom;
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
		return this.getCode() + " - " + this.getNom();
	}
}
