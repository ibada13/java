
public class Myexption extends Exception {
    public Myexption(String equ,Throwable err, String msg) {
        super(msg, err);
        if(equ!=null){
            System.out.println("the input is : " + equ);
        }
        
    }

}
