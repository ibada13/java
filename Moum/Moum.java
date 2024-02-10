package Moum;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Set;

public class Moum {
    
    private String nom;
    private String catégorie;

    private String lieu;
    private Boolean Isopen;

    public Boolean isIsopen() {
        return this.Isopen;
    }

    public Boolean getIsopen() {
        return this.Isopen;
    }

    public void setIsopen(Boolean Isopen) {
        this.Isopen = Isopen;
    }
    private ArrayList<Jour> days = new ArrayList<Jour>();
    
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCatégorie() {
        return this.catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }

    public String getLieu() {
        return this.lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public ArrayList<Jour> getDays() {
        return this.days;
    }

    public void setDays(ArrayList<Jour> days) {
        this.days = days;
    }
    
    public void Moum() {

    }

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name : ");
        this.nom = scan.nextLine();
        System.out.println("enter the cat : ");
        this.catégorie = scan.nextLine();
        System.out.println("enter the days (if u have multiple days try to sprate them with space) :  ");
        String days[] = scan.nextLine().split(" ");
        for (int i = 0; i < days.length; i++) {
            this.days.add(Jour.valueOf(days[i]));
        }
    }

    public void EtatMon() {
        System.out.println(Isopen?"opend":"closed");
    }



    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", catégorie='" + getCatégorie() + "'" +
            ", lieu='" + getLieu() + "'" +
            ", days='" + getDays() + "'" +
            "}";
    }
    
}
