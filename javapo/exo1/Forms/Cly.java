package Forms;

public class Cly extends Forme {
    private double high;
    private double rayon;

    Cly(double hi, double ra, String nom) {
        super(nom);
        high = hi;
        rayon = ra;

    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2) * high;
    }
}
