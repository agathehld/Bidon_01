package chap08;

import java.util.Scanner;

import chap7.Livre;
import java.util.*;

public class NouvelleBibli {
	
		public void main(String[] args) {
	
		NouveauLivre livrePoche = new NouveauLivre();
		
		Scanner lectureClavier1 = new Scanner(System.in);
		NouveauLivre LivrePoche = new NouveauLivre();
		System.out.print("Entrez le titre : "); 
		// permet de recuperer la varibale qui est en private 
		livrePoche.setTitre(lectureClavier1.next());
				
// à finir pour les autres criteres du nouveau livre 
		String a; 
		livrePoche.afficherUnLivre();
	 livrePoche.getCode();
// ps finit mais sert a rien 
		
		}

		}



