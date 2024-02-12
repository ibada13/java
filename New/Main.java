import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main 
{
 
    

    public static void main(String[] args) {
        ArrayList<X> x = new ArrayList<X>();
        X c = new X();
        x.add(c);
        String s = x.get(0).getX();
       System.out.println("the X :"+s);

    }


}
