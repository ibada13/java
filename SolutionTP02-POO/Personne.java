
public class Personne {
	
	
	private String nom;
	
	private String prenom;
	
	
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	Personne(String nom, String prenom){
		
		this.nom = nom;
		this.prenom = prenom;
		
	}
	
	
	Personne(){
		
	}
	
	/*void sePresenter(){
		
		System.out.println("Je suis: "+this.nom+" "+this.prenom);
	}*/
	
	String sePresenter(){
		
		String message;
		message = "Je suis: "+this.nom+" "+this.prenom;
		return message;
	
	}

}
