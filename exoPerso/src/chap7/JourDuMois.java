package chap7;
import java.util.*;

public class JourDuMois {
	public static void main (String [] parametre) { 
		String mois;
		int nbJour= 0, annee;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("quel mois choisisez vous?");
		mois = lectureClavier.next();
		mois = mois.replace("û", "u"); 
		mois = mois.replace("é", "e"); 
		mois = mois.toLowerCase();
		System.out.println("quel annee choisisez vous?");
		annee = lectureClavier.nextInt();
		switch(mois) {
		case "janvier" : case "mars" :case "mai" : case "juillet" : case "aout" : case "octobre" : case "decembre" :
		nbJour = 31 ;
		break ;
		case "avril" : case "juin" : 
		case "septembre" : case "novembre" : nbJour = 30 ; 
		break ;
		case "fevrier" :
		 if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) 
			 nbJour = 29 ;
		else
			nbJour = 28 ;
		 
		 break ;
		default : 
		System.out.println("Impossible, ce mois n'existe pas ") ; 
		System.exit(0) ;
		}
		System.out.print(" En " + annee + ", le mois de " + mois) ; System.out.println(" a " + nbJour + " jours ") ;
		}
	}


