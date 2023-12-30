
public class Personnel {
	
	MembrePersonnel[] listPersonnel;
	 //-----------------------------------------------------------------
	 // Sets up the list of staff members.
	 //-----------------------------------------------------------------
	 public Personnel()
	 {
		 listPersonnel = new MembrePersonnel[6];
		 
		 listPersonnel[0] = new Directeur ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		 
		 listPersonnel[1] = new Employee ("Carla", "456 Off Line","555-0101", "987-65-4321", 1246.15);
		 
		 listPersonnel[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
		 
		 listPersonnel[3] = new Interim ("Diane", "678 Fifth Ave.","555-0690", "958-47-3625", 10.55);
		 
		 listPersonnel[4] = new Volontaire ("Norm", "987 Suds Blvd.","555-8374");
		 
		 listPersonnel[5] = new Volontaire ("Cliff", "321 Duds Lane","555-7282");
		 
		 ((Directeur)listPersonnel[0]).donnerBonus(500.00);
		 
		 ((Interim)listPersonnel[3]).ajouterHeures(40); 
		 
	 }
	 
	 public void payday ()
	 {
		 double amount;
		 for (int count=0; count < listPersonnel.length; count++)
		 {
			 System.out.println (listPersonnel[count]);
			 amount = listPersonnel[count].payer(); // polymorphic
			 if (amount == 0.0)
			     System.out.println ("Thanks!");
			 else
				 System.out.println ("Paid: " + amount);
				 System.out.println ("-----------------------------------");
		 }
	 } 

}
