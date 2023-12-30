package Forms;
public class Rect extends Forme {
    private double longer;
    private double larger;

    Rect(double lon, double lar, String nom) {
        super(nom);
        longer = lon;
        larger = lar;
    }

    public double surface() {
        return longer * larger;
    }
}