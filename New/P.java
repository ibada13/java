public class P {
    
    public P(int i) {
        System.out.println(1);
    }

    public P() {
        this(10);
        System.out.println(2);
    }

    void P() {
        P(10);
        System.out.println(3);
    }

    void P(int i) {
        System.out.println(4);
    }
}
