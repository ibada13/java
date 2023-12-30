package Paint;

import Forms.Forme;

public class Paint {
    private double couv;

    public void setcouv(double co) {
        couv = co;
    }

    public double calcqa(Forme obj) {
        System.out.println("you are calcing qt for : " + obj.toString());
        System.out.println("and the qt is : " + obj.surface() / couv);
        return obj.surface() / couv;
    }
}
