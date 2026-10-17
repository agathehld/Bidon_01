package chap7;

public class Livre {
	
	String nomAuteur , prenomAuteur , titre, categorie;
	String ISBN, code;
	public void afficherUnLivre() {
		System.out.println("le livre est"+ "" + titre);
		System.out.println("il a été ecrit par"+ "" + prenomAuteur + nomAuteur);
		System.out.println("il appartient a la catégorie" + "" + categorie);
		System.out.println("et a comme ISBN " + "" + ISBN) ;

	
}
	public String CalculerleCode() {	
		String deuxPremierelettresP, deuxPremierelettresN, deuxPremierelettresCategorie ;

		deuxPremierelettresP = nomAuteur.substring(0,2);
		deuxPremierelettresN = prenomAuteur.substring(0,2);
		deuxPremierelettresCategorie = categorie.substring(0,2);
		
		return deuxPremierelettresP+deuxPremierelettresN+deuxPremierelettresCategorie;
		
	}
	

	

}
