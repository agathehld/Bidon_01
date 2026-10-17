package chap08;

public class NouveauLivre {

		
		private String nomAuteur , prenomAuteur , titre, categorie;
		private String ISBN, code;
	
		public void afficherUnLivre() {
			System.out.println("le livre est"+ "" + titre);
			System.out.println("il a été ecrit par"+ "" + prenomAuteur + nomAuteur);
			System.out.println("il appartient a la catégorie" + "" + categorie);
			System.out.println("et a comme ISBN " + "" + ISBN) ;

		
	}
		private String setCode() {	
			String deuxPremierelettresP, deuxPremierelettresN, deuxPremierelettresCategorie ;

			deuxPremierelettresP = nomAuteur.substring(0,2);
			deuxPremierelettresN = prenomAuteur.substring(0,2);
			deuxPremierelettresCategorie = categorie.substring(0,2);
			
			return deuxPremierelettresP+deuxPremierelettresN+deuxPremierelettresCategorie;
			
		}
		
		public void setTitre(String newTitre) {
			titre = newTitre;
		}
		
		public void setNomAuteur(String newNom) {
			nomAuteur = newNom; 
			
		}
		public void setPrenomAuteur(String newPrenom) {
			nomAuteur = newPrenom; 
		}
		public void setCategorie(String newCategorie) {
			nomAuteur = newCategorie; 
		}
		public void setISBN(String newISBN) {
			nomAuteur = ISBN; 
		}
		public void setCode(String newCode) {
			nomAuteur = newCode; 
		}
		
		public String getTitre() {
			return titre; 
		}
		public String getCode() {
			return code; 
		}
		
		

		

	}



