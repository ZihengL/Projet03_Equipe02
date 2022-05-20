package utilitaires;

import java.util.Arrays;

import objets_Cegep.Cours;
import objets_Cegep.Groupe;
import objets_Cegep.Programme;
import objets_Membre.Enseignant;
import objets_Membre.Etudiant;
import objets_Membre.Membre;

/*
 * Description: Classe qui contient toutes les méthodes concernant les tableaux
 *
 * Auteur: Zi heng Liu
 * Date: 19/05/2022
 * V 1.0 
 */
public class Tableaux {

	/*
	 * 
	 */
	public static void incrementerTableau(Object[] tableau, Object objet) {
		if (objet.getClass() == tableau.getClass()) {
			tableau = Arrays.copyOf(tableau, tableau.length + 1);
			tableau[tableau.length - 1] = objet;
		}
	}

	/*
	 * 
	 */
	public static void unifierMembres(Membre[] primaire, Membre[] secondaire) {
		for (int i = 0; i < secondaire.length; i++)
			if (secondaire[i] != null)
				Tableaux.incrementerTableau(primaire, secondaire[i]);
	}

	/*
	 * Méthodes de tri par ordre croissant
	 */

	public static void trierCroissantEtudiant(Etudiant tableau[]) {
		Etudiant temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) < 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierCroissantEnseignant(Enseignant tableau[]) {
		Enseignant temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) < 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierCroissantMembre(Membre tableau[]) {
		Membre temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) < 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierCroissantGroupe(Groupe tableau[]) {
		Groupe temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) < 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierCroissantCours(Cours tableau[]) {
		Cours temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) < 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierCroissantProgrammes(Programme tableau[]) {
		Programme temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) < 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	/*
	 * Méthodes de tri par ordre décroissant
	 */

	public static void trierDecroissantEtudiant(Etudiant tableau[]) {
		Etudiant temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) > 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierDecroissantEnseignant(Enseignant tableau[]) {
		Enseignant temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) > 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierDecroissantMembre(Membre tableau[]) {
		Membre temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) > 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierDecroissantGroupe(Groupe tableau[]) {
		Groupe temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) > 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierDecroissantCours(Cours tableau[]) {
		Cours temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) > 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	public static void trierDecroissantProgrammes(Programme tableau[]) {
		Programme temp;

		if (tableau != null)
			for (int i = 0; i < tableau.length; i++)
				for (int j = i + 1; j < tableau.length; j++)
					if (tableau[j] != null && tableau[j].toString().compareTo(tableau[i].toString()) > 0) {
						temp = tableau[i];
						tableau[i] = tableau[j];
						tableau[j] = temp;
					}
	}

	/*
	 * Méthodes de recherche
	 */
	public int rechercherEtudiants(Etudiant[] etudiants, Etudiant etudiant) {
		int position = -1;

		for (int i = 0; i < etudiants.length && position == -1; i++) {
			if (etudiants[i] != null && etudiants[i].equals(etudiant))
				position = i;
		}
		return position;
	}

	public int rechercherEnseignants(Enseignant[] enseignants, Enseignant enseignant) {
		int position = -1;

		for (int i = 0; i < enseignants.length && position == -1; i++) {
			if (enseignants[i] != null && enseignants[i].equals(enseignant))
				position = i;
		}
		return position;
	}

	public int rechercherMembres(Membre[] membres, Membre membre) {
		int position = -1;

		for (int i = 0; i < membres.length && position == -1; i++) {
			if (membres[i] != null && membres[i].equals(membre))
				position = i;
		}
		return position;
	}

	public int rechercherGroupes(Groupe[] groupes, Groupe groupe) {
		int position = -1;

		for (int i = 0; i < groupes.length && position == -1; i++) {
			if (groupes[i] != null && groupes[i].equals(groupe))
				position = i;
		}
		return position;
	}

	public int rechercherCours(Cours[] cours, Cours cour) {
		int position = -1;

		for (int i = 0; i < cours.length && position == -1; i++) {
			if (cours[i] != null && cours[i].equals(cour))
				position = i;
		}
		return position;
	}

	public int rechercherProgrammes(Programme[] programmes, Programme programme) {
		int position = -1;

		for (int i = 0; i < programmes.length && position == -1; i++) {
			if (programmes[i] != null && programmes[i].equals(programme))
				position = i;
		}
		return position;
	}
}
