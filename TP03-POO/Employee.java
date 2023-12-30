

public class Employee extends MembrePersonnel{
	
	
	 protected String numSecuriteSociale;
	 protected double tauxRemuneration;

	 
	 public Employee (String eNom, String eAddresse, String eTel, String numSecSoc, double taux)
	 {
		 super (eNom, eAddresse, eTel);
		 numSecuriteSociale = numSecSoc;
		 tauxRemuneration = taux;
	 }
	
	 
	 
	 public String toString()
	 {
		 String resultat = super.toString();
		 resultat += "\nNuméro de Sécurité Sociale: " + numSecuriteSociale;
		 return resultat;
	 }
	 
	 
	 
	 public double payer()
	 {
		 return tauxRemuneration;
	 } 

}
