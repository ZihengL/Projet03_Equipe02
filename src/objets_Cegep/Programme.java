package objets_Cegep;

import java.util.Arrays;

import objets_Membre.Etudiant;

/*
 * Description: 
 *
 * Auteurs: Zi heng Liu, Natalia Garcia, Mathieu Garcia
 * Date: 18/05/2022
 * V 1.0 
 */
public class Programme {

	private Cegep cegep;

	private String codeProgramme;
	private String programme;

	private Cours[] cours;
	private Etudiant[] membres;

	/* CONSTRUCTEURS */

	/*
	 * 
	 */
	public Programme() {
		this("", "");
	}

	/*
	 * 
	 */
	public Programme(String codeProgramme, String programme) {
		super();
		this.codeProgramme = codeProgramme;
		this.programme = programme;
		this.cours = new Cours[0];
		this.membres = new Etudiant[0];
	}

	/* GETTERS */

	/*
	 * 
	 */
	public String getProgramme() {
		return this.programme;
	}

	/*
	 * 
	 */
	public String getCodeProgramme() {
		return this.codeProgramme;
	}

	/*
	 * 
	 */
	public Etudiant[] getMembres() {
		return this.membres;
	}

	/*
	 * 
	 */
	public Cours[] getCours() {
		return this.cours;
	}

	/* SETTERS */

	/*
	 * 
	 */
	public void setProgramme(String programme) {
		this.programme = programme;
	}

	/*
	 * 
	 */
	public void setCodeProgramme(String codeProgramme) {
		this.codeProgramme = codeProgramme;
	}

	/*
	 * 
	 */
	public void setMembres(Etudiant[] membres) {
		this.membres = membres;
	}

	/*
	 * 
	 */
	public void setCours(Cours[] cours) {
		this.cours = cours;
	}

	/* MÉTHODES */

	/*
	 * 
	 */
	public void ajouterCours(String cours) {
		this.cours = Arrays.copyOf(this.cours, this.cours.length + 1);
		this.cours[this.cours.length - 1] = new Cours(cours);
	}

	/*
	 * 
	 */
	@Override
	public String toString() {
		return "";
	}
}
