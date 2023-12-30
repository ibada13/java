import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> L = new ArrayList<>(Arrays.asList("black", "red", "white", "pink", "spy"));
        L.add(0, "Purple");
        L.add(L.size() , "Yellow");
        for (String x : L) {
            System.out.println(L.size());
            System.out.println(x);
        }

    }
}
