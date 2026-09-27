package chap7;
import java.util.*;

public class OperationPhrase {
	public static void main(String[] args ) {
		String phrase= "", phraseTransfo="", remplacementA="";
		int nbA= 0;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("entrez une phrase svp:");
		phrase = lectureClavier.next();
		phraseTransfo = phrase.toUpperCase();
		System.out.println("la phrase que vous avez saisie est en majuscule: "+ phraseTransfo);
		// marche ps bien a partir de la 
		nbA = phrase.length();
		System.out.println("il y a :"+ nbA + "de a dans votre phrase");
		remplacementA =phrase.replace('a','*' ); 
		System.out.println("apres le remplacement la phrase devient:"+ remplacementA);
		if (phrase.regionMatches(5,remplacementA,0,7)) 
	    System.out.println("La sous chaine " + remplacementA+ " est bien placee ");
			
		}
		
	}


