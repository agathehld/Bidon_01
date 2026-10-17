package ex0707;
import java.util.*;

public class Rectangle {
	int positionx, positiony,hauteur,largeur,couleur;
	
	public void creer() {
	Scanner lectureClavier = new Scanner(System.in);	
	System.out.println("quelle est la position en x (elle doit etre comprise entre 0 et 800)"+ "" +":");
	positionx = lectureClavier.nextInt();
	Scanner lectureClavier1 = new Scanner(System.in);	
	System.out.println("quelle est la position en y (elle doit etre comprise entre 0 et 600)"+""+":");
	positiony = lectureClavier1.nextInt();
	Scanner lectureClavier2 = new Scanner(System.in);	
	System.out.println("quelle est la hauteur (elle doit etre comprise entre 0 et 600)"+""+":");
	hauteur= lectureClavier2.nextInt();
	Scanner lectureClavier3 = new Scanner(System.in);	
	System.out.println("quelle est la largeur (elle doit etre comprise entre 0 et 800)"+""+":");
	largeur = lectureClavier3.nextInt();
	Scanner lectureClavier4 = new Scanner(System.in);	
	System.out.println("quelle est la couleur (elle doit etre comprise entre 0 et 10)"+""+":");
	largeur = lectureClavier4.nextInt();
	}
	 
	public void afficher() {
		System.out.println("la position en x est :"+ positionx);
		System.out.println("la position en y est :"+ positiony);
		System.out.println("la largeur est :"+ largeur);
		System.out.println("la  hauteur est :"+ hauteur);
		System.out.println("la couleur est :"+ couleur);

	}
	public void deplacer(int npositionx, int npositiony) {
		positionx += npositionx;
		positiony += npositiony;
		
		
	}
	

}
