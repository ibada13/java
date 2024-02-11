

public class Directeur extends Employee {
	
     private double bonus;
	 
	 public Directeur (String eNom, String eAddresse, String eTel, String numSecSoc, double taux)
	 {
		 super (eNom, eAddresse, eTel, numSecSoc, taux);
		 bonus = 0; 
	 }
	
	 public void donnerBonus(double direcBonus)
	 {
		 bonus = direcBonus;
	 }
	 
	 
	 public double pay()
	 {
		 double paiement = super.payer() + bonus;
		 bonus = 0;
		 return paiement;
	 } 

}
