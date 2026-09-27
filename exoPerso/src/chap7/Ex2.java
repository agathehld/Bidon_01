package chap7;
import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		String mots1 = "";
		System.out.println("entrer le mot FIN pour sortir");	
		
		do {
			
			try (Scanner lectureClavier = new Scanner(System.in)) {
				System.out.println("entrez un mot svp:");
				mots1 = lectureClavier.next();
			}
			
		} while (mots1 != "FIN");
	}

}
