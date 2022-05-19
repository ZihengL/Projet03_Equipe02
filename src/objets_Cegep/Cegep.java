package objets_Cegep;

import java.util.Arrays;

import objets_Membre.Membre;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Cegep {

	private String etablissement;

	private Membre[] membres;
	private Programme[] programmes;
	private String[] departements;

	/* CONSTRUCTEURS */

	public Cegep() {
		this("");
	}

	/*
	 * 
	 */
	public Cegep(String etablissement) {
		this.etablissement = etablissement;

		this.membres = new Membre[0];
		this.programmes = new Programme[0];
		this.departements = new Departement[0];
	}

	/* GETTERS */

	/*
	 * 
	 */
	public String getEtablissement() {
		return this.etablissement;
	}

	/*
	 * 
	 */
	public Membre[] getMembres() {
		return this.membres;
	}

	/*
	 * 
	 */
	public Programme[] getProgrammes() {
		return this.programmes;
	}

	/*
	 * 
	 */
	public Departement getDepartement(int position) {
		return this.departements[position];
	}

	/*
	 * 
	 */
	public Departement[] getDepartements() {
		return this.departements;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public void setDepartements(Departement[] departements) {
		this.departements = departements;
	}

	/*
	 * 
	 */
	public void setMembres(Membre[] membres) {
		this.membres = membres;
	}

	/*
	 * 
	 */
	public void setProgrammes(Programme[] programmes) {
		this.programmes = programmes;
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	public void ajouterMembre(Membre membre) {
		this.membres = Arrays.copyOf(this.membres, this.membres.length + 1);
		this.membres[this.membres.length - 1] = membre;
	}

	/*
	 * 
	 */
	public void ajouterDepartement(String departement) {
		this.departements = Arrays.copyOf(this.departements, this.departements.length + 1);
		this.departements[this.departements.length - 1] = new Departement(departement);
	}

	/*
	 * 
	 */
	public void ajouterProgramme(Programme programme) {
		this.programmes = Arrays.copyOf(this.programmes, this.programmes.length + 1);
		this.programmes[this.programmes.length - 1] = programme;
	}

	/*
	 * 
	 */
	@Override
	public String toString() {
		return "";
	}
}
