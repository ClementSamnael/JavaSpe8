package dev.JavaSpe8.util;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

import dev.JavaSpe8.bo.UtilisateurJ7;
import dev.JavaSpe8.bo.UtilisateurJ8;

public class Util {
	
	public static void mockList(ArrayList<UtilisateurJ7> utilisateursJ7) throws ParseException {
		utilisateursJ7.add(new UtilisateurJ7("Alexei", "Ayinde", "2019/05/23"));
		utilisateursJ7.add(new UtilisateurJ7("Adrien", "Chauvin", "2019/04/23"));
		utilisateursJ7.add(new UtilisateurJ7("Mathide", "Monique","2012/06/3"));
		utilisateursJ7.add(new UtilisateurJ7("Glen", "Ollivier", "2013/02/10"));
		utilisateursJ7.add(new UtilisateurJ7("Robin", "Cassan", "2014/03/14"));
		utilisateursJ7.add(new UtilisateurJ7("Robin", "Broquerie","2014/03/12"));
		utilisateursJ7.add(new UtilisateurJ7("Clement", "Brieuc", "2019/05/14"));
		utilisateursJ7.add(new UtilisateurJ7("Jean-Baptiste", "Mathieu","2012/06/14"));
		utilisateursJ7.add(new UtilisateurJ7("Clément", "Ormaux", "2013/07/29"));
	}
	
	public static void mockList2(ArrayList<UtilisateurJ8> utilisateursJ8) {
		
		LocalDate ld = LocalDate.of(2019,05,23);
		LocalDate ld2 = LocalDate.of(2019,04,23);	
		LocalDate ld3 = LocalDate.of(2012,06,3);	
		LocalDate ld4 = LocalDate.of(2013,02,10);	
		LocalDate ld5 = LocalDate.of(2014,03,14);	
		LocalDate ld6 = LocalDate.of(2014,03,12);	
		LocalDate ld7 = LocalDate.of(2019,05,14);	
		LocalDate ld8 = LocalDate.of(2012,06,14);	
		LocalDate ld9 = LocalDate.of(2013,07,29);	
		
		utilisateursJ8.add(new UtilisateurJ8("Alexei", "Ayinde", ld));
		utilisateursJ8.add(new UtilisateurJ8("Adrien", "Chauvin", ld2));
		utilisateursJ8.add(new UtilisateurJ8("Mathide", "Monique",ld3));
		utilisateursJ8.add(new UtilisateurJ8("Glen", "Ollivier", ld4));
		utilisateursJ8.add(new UtilisateurJ8("Robin", "Cassan", ld5));
		utilisateursJ8.add(new UtilisateurJ8("Robin", "Broquerie",ld6));
		utilisateursJ8.add(new UtilisateurJ8("Clement", "Brieuc", ld7));
		utilisateursJ8.add(new UtilisateurJ8("Jean-Baptiste", "Mathieu", ld8));
		utilisateursJ8.add(new UtilisateurJ8("Clément", "Ormaux", ld9));
	}
	
	
}
