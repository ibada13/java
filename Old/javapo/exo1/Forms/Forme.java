package Forms;

public abstract class Forme {
    protected String nom;

    public abstract double surface();

    Forme(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return nom;
    }
}
