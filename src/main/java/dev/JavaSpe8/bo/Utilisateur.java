package dev.JavaSpe8.bo;

public abstract class Utilisateur {

	protected String prenom;
	protected String nom;

	public Utilisateur(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	public Utilisateur() {
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utilisateur [prenom = ");
		builder.append(prenom);
		builder.append(", nom = ");
		builder.append(nom);
		builder.append("]");
		return builder.toString();
	}

}
