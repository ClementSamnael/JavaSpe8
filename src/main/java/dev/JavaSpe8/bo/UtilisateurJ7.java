package dev.JavaSpe8.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class UtilisateurJ7 extends Utilisateur {

	private Calendar dateAdhesion;

	public UtilisateurJ7(String prenom, String nom, String date) throws ParseException {
		super(prenom, nom);
		dateAdhesion = new GregorianCalendar();
		Date format = new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE).parse(date);
		this.dateAdhesion.setTime(format);

	}

	public Calendar getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(Calendar dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurJ7 [prenom = ");
		builder.append(prenom);
		builder.append(", nom = ");
		builder.append(nom);
		builder.append(" dateAdhesion = ");
		builder.append(dateAdhesion);
		builder.append("]");
		return builder.toString();
	}

	public void executeJ7() {

		
	}

}
