public class EntreeIllegaleException extends Myexption {
    public EntreeIllegaleException(String equ,Throwable err, String msg) {
        super(equ, new NumberFormatException(), msg);
    }
}
