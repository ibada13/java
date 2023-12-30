
abstract public class MembrePersonnel {
	
	
	 protected String nom;
	 protected String addresse;
	 protected String tel;
	 //-----------------------------------------------------------------
	 // Sets up a staff member using the specified information.
	 //-----------------------------------------------------------------
	 public MembrePersonnel (String eNom, String eAddresse, String eTel)
	 {
		 nom = eNom;
		 addresse = eAddresse;
		 tel = eTel;
	 }
	 //-----------------------------------------------------------------
	 // Returns a string including the basic employee information.
	 //-----------------------------------------------------------------
	 public String toString()
	 {
	 String result = "Nom: " + nom + "\n";
	 result += "Addresse: " + addresse + "\n";
	 result += "Num de Tel: " + tel;
	 return result;
	 }
	 //-----------------------------------------------------------------
	 // Derived classes must define the pay method for each type of
	 // employee.
	 //-----------------------------------------------------------------
	 public abstract double payer();

}
