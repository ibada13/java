
public class Myexption extends Exception {
    public Myexption(String equ,Throwable err, String msg) {
        super(msg, err);
        System.out.println("the input is : "+equ);
        
    }

}
