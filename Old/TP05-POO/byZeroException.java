public class byZeroException extends Myexption {
    public byZeroException(String equ,Throwable err, String msg) {
        super(equ,  new ArithmeticException(), "don't try to device by zero again ok ?");
    }
}
