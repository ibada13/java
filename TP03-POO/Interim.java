
public class Interim extends Employee{
	
	private int nbrHeuresTravail;
	 //-----------------------------------------------------------------
	 // Sets up this hourly employee using the specified information.
	 //-----------------------------------------------------------------
	 public Interim (String eNom, String eAddresse, String eTel, String numSecSoc, double taux)
	 {
		 super (eNom, eAddresse, eTel, numSecSoc, taux);
		 nbrHeuresTravail = 0;
	 }
	 //-----------------------------------------------------------------
	 // Adds the specified number of hours to this employee's
	 // accumulated hours.
	 //-----------------------------------------------------------------
	 public void ajouterHeures(int heureAdditionnelles)
	 {
		 nbrHeuresTravail += heureAdditionnelles;
	 }
	 //-----------------------------------------------------------------
	 // Computes and returns the pay for this hourly employee.
	 //-----------------------------------------------------------------
	 public double payer()
	 {
	 double paiement = tauxRemuneration * nbrHeuresTravail;
	 nbrHeuresTravail = 0;
	 return paiement;
	 }
	 //-----------------------------------------------------------------
	 // Returns information about this hourly employee as a string.
	 //-----------------------------------------------------------------
	 public String toString()
	 {
	 String resultat = super.toString();
	 resultat += "\nHeures Actuelles: " + nbrHeuresTravail;
	 return resultat;
	 }
}
