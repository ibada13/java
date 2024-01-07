import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exer {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList<String>(Arrays.asList("op ", "ana ", "fr","bn ", "ap"));
        fruits.add("Yellow");
        fruits.add(0, "Purple");
        for (Object object : fruits) {
            System.out.println(object);
        }
        System.out.println("----------------------");
        ArrayList newfuits = fruits;
        Collections.sort(newfuits);
                for (Object object : newfuits) {
            System.out.println(object);
        }
    }
}
