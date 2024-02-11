import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Y x = new Y();
        ArrayList<Integer> v = new ArrayList<>();
        v.add(22);
        v.add(254);
        v.add(2332);
        v.add(3322);
        
        Iterator po = v.iterator();
        while (po.hasNext()) {
           
        
        }
        HashMap<Integer, String> x = new HashMap<>();
        x.put(2, "ss");
        x.put(26, "ss66");
        x.put(24, "ss664");
        x.put(25, "ss6464");
        
        for (String s : x.values()) {
            char[] d = s.toCharArray(); 
            System.err.println(s.length());
        }
    }
}
