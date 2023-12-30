public class Commission extends Interim {
    private double tc;
    public Commission(String eNom, String eAddresse, String eTel, String numSecSoc, double taux,double tc) {
        super(eNom, eAddresse, eTel, numSecSoc, taux);
        this.tc = tc;

    }

    private double totalvent;
    private double comi;
    public void add_vent(double vent) {
        totalvent += vent;
        this.setcomi(totalvent*tc);
    }

    public void setcomi(double comi) {
        this.comi = comi;
    }

    public double payer() {
        double money = super.payer() + totalvent;
        totalvent = 0 ;

        return  money;
    }
    
    
    
}
