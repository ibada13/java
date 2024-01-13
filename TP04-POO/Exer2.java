import java.util.*;

public class Exer2 {

    public static void main(String[] args) {

        HashSet<String> corbeille01 = new HashSet<String>(
                Arrays.asList("Banane,Kiwi,Pomme,Orange,Clémentine".split(",")));
        Iterator<String> iter = corbeille01.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
        HashSet<String> corbeille02 = new HashSet<String>();
        corbeille02 = (HashSet)corbeille01.clone();
        System.err.println("------------------------");
        Iterator<String> iter2 = corbeille02.iterator();
        while (iter2.hasNext()) {
            String element = iter2.next();
            System.out.println(element);
        }
        
        corbeille02.add("Banane");
        corbeille02.add("Banane");
        iter2 = corbeille02.iterator();
                System.err.println("------------------------");

        while (iter2.hasNext()) {
            String element = iter2.next();
            System.out.println(element);
        }
        LinkedList<String> fr = new LinkedList<String>(Arrays.asList("pomme", "nothing"));
        iter2 = corbeille02.iterator();
        while (iter2.hasNext()) {
            fr.add(iter2.next());
        }
                System.err.println("------------------------");

        Iterator<String> iter3 = fr.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }


    }

}


