package chap7;
import java.util.*;

public class Bibliotheque {
	public void main(String[] args) {
	Scanner lectureClavier = new Scanner(System.in);
	Livre livrePoche = new Livre();
	
	System.out.println("quel est le nom de l'auteur?");
	livrePoche.nomAuteur = lectureClavier.next();  
	System.out.println("quel est le prenom de l'auteur?");
	livrePoche.prenomAuteur = lectureClavier.next();
	System.out.println("quel est le titre du livre?");
	livrePoche.titre = lectureClavier.next();
	System.out.println("quel est le ISBN?");
	livrePoche.ISBN = lectureClavier.next();
	System.out.println("quel est la catégorie?");
livrePoche.categorie = lectureClavier.next();
	String a; 
	livrePoche.afficherUnLivre();
	a = livrePoche.CalculerleCode() ;
	System.out.println("le code est:"+ "" + a);
	
	
	}

	}

