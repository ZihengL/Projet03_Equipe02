package objets_Membre;

/*
 * Description: Classe qui simule un objet de type Membre
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
	public void setCode() {
		this.code = this.nom.substring(0, (this.nom.length() < 3 ? this.nom.length() : 3)).toUpperCase()
				+ "XXX".substring(0, (3 - this.nom.length() < 0 ? 0 : 3 - this.nom.length()));
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
