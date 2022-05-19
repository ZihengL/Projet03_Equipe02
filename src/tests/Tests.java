package tests;

import objets_Membre.Etudiant;

/*
 * Description: 
 *
 * Auteur: Zi heng Liu
 * Date: 18/05/2022
 * V 1.0 
 */
public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant etudiants[] = new Etudiant[10];

		for (int i = 0; i < etudiants.length; i++) {
			etudiants[i] = new Etudiant("leRat " + i);
			System.out.println(etudiants[i]);
		}
	}

}
