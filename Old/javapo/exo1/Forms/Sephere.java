package Forms;
public class Sephere extends Forme{
    private double rayon;

    Sephere(double ray, String nom) {
        super(nom);
        rayon = ray;
        
    }

    public double surface() {
        return 4 * Math.PI * rayon;
    }

}
