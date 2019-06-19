package dev.JavaSpe8.bo;

import java.time.LocalDate;

public class UtilisateurJ8 extends Utilisateur{

	private LocalDate dateAd;
	
	public UtilisateurJ8(String prenom, String nom, LocalDate dateAd) {
		super(prenom,nom);
		this.dateAd = dateAd;
	}

	public LocalDate getDateAd() {
		return dateAd;
	}

	public void setDateAd(LocalDate dateAd) {
		this.dateAd = dateAd;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurJ8 [dateAd = ");
		builder.append(dateAd);
		builder.append(", prenom = ");
		builder.append(prenom);
		builder.append(", nom = ");
		builder.append(nom);
		builder.append("]");
		return builder.toString();
	}
	
}
