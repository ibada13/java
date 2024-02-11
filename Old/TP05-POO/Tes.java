class Appel {
    public void methodeA() {
        try {
            
            methodeB();
        } catch (ArithmeticException e) {
            System.out.println("from a :the err is :");
            e.printStackTrace();
        }
    }
    
    public void methodeB() throws ArithmeticException {
        try {
            
            methodeC();
        } catch (ArithmeticException e) {
            System.out.println("from b :the err is :");
            e.printStackTrace();
        }
    }
    
    public void methodeC() throws ArithmeticException {
        int x;
        try {
            
             x =  1/0;
        } catch (ArithmeticException e) {
            System.out.println("from c :the err is :");
            e.printStackTrace();
        }

    }
}

public class Tes {
    public static void main(String[] args) {
        Appel appel = new Appel();
        try {
            appel.methodeA();
        } catch (ArithmeticException e) {
            System.out.println("the err is :");
            e.printStackTrace();
        }
    }
}
