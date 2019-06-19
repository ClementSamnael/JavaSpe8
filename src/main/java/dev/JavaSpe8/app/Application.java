package dev.JavaSpe8.app;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import dev.JavaSpe8.bo.UtilisateurJ7;
import dev.JavaSpe8.bo.UtilisateurJ8;
import dev.JavaSpe8.util.Util;

public class Application {

	/**
	 * L'objectif de ce tp est de proposer deux implémentations à l'exécution
	 * identique La premiere implémentation ne devra pas employer les nouveautés
	 * Java8 (usage de boucles pour les opérations) La deuxième implémentation devra
	 * faire appel aux nouveautés Java8 (lambda, stream, dates) Une fois les deux
	 * implémentations misent en place, un système de comparaison des performances
	 * pourra être mis en place
	 */
	public static void main(String[] args) throws ParseException {

		Application app = new Application();
//		app.executeJ7();
		app.executeJ8();
	}

	public void executeJ7() throws ParseException {
		ArrayList<UtilisateurJ7> utilisateursJ7 = new ArrayList<UtilisateurJ7>();
		Util.mockList(utilisateursJ7);

		// Afficher tous les utilisateurs
		for (UtilisateurJ7 utilisateurJ7 : utilisateursJ7) {
			System.out.println(utilisateurJ7);
			System.out.println(utilisateurJ7.getDateAdhesion());

		}

		System.out.println();
		System.out.println(
				"============================================================================================");
		System.out.println();

		// Par date d'ancienneté
		utilisateursJ7.sort(new Comparator<UtilisateurJ7>() {

			public int compare(UtilisateurJ7 user1, UtilisateurJ7 user2) {
				int nomComp = user1.getDateAdhesion().compareTo(user2.getDateAdhesion());
				return (nomComp != 0) ? nomComp : user1.getPrenom().compareTo(user2.getPrenom());
			}
		});

		for (UtilisateurJ7 utilisateurJ7 : utilisateursJ7) {
			System.out.println(utilisateurJ7);
		}

		System.out.println();
		System.out.println(
				"============================================================================================");
		System.out.println();

		// Tri décroissant
		utilisateursJ7.sort(new Comparator<UtilisateurJ7>() {

			public int compare(UtilisateurJ7 user1, UtilisateurJ7 user2) {
				int nomComp = user2.getNom().compareTo(user1.getNom());
				return (nomComp != 0) ? nomComp : user2.getPrenom().compareTo(user1.getPrenom());
			}
		});

		System.out.println();
		System.out.println(
				"============================================================================================");
		System.out.println();

		for (UtilisateurJ7 utilisateurJ7 : utilisateursJ7) {
			System.out.println(utilisateurJ7);
		}
		// Retenir les trois premiers de la liste + si nom containt le caractere A, on
		// le met en majuscule
		for (int i = 0; i < 3; i++) {
			if (i < utilisateursJ7.size()) {
				UtilisateurJ7 userJ7 = utilisateursJ7.get(i);
				if ((userJ7.getNom()).contains("a")) {
					userJ7.setNom(userJ7.getNom().toUpperCase());
				}
			}
		}

		System.out.println();
		System.out.println(
				"============================================================================================");
		System.out.println();

		for (UtilisateurJ7 utilisateurJ7 : utilisateursJ7) {
			System.out.println(utilisateurJ7);
		}
	}

	public void executeJ8() {
		ArrayList<UtilisateurJ8> utilisateursJ8 = new ArrayList<UtilisateurJ8>();
		Util.mockList2(utilisateursJ8);

		// Afficher tous les utilisateurs
		utilisateursJ8.stream().forEach(System.out::println);// lambda : (p->syso(p)

		System.out.println();
		System.out.println(
				"============================================================================================");
		System.out.println();

		// Par date d'ancienneté
		utilisateursJ8.stream().sorted((user1, user2) -> user1.getDateAd().compareTo(user2.getDateAd()))
				.forEach(System.out::println);

		System.out.println();
		System.out.println(
				"============================================================================================");
		System.out.println();

		// Tri décroissant
		// Retenir les trois premiers de la liste + si nom containt le caractere A, on
		// le met en majuscule
		utilisateursJ8.stream()
		.sorted((user1, user2) -> {
			int nomComp = user1.getNom().compareTo(user2.getNom())*-1;
		return nomComp != 0 ? nomComp : user2.getPrenom().compareTo(user1.getPrenom());})
		.limit(3)
		.filter(user -> user.getNom().toUpperCase().contains("a"))
		.map(user -> {
			user.setNom(user.getNom().toUpperCase());
			return user;
		})
		.collect(Collectors.toList());
	}
}
