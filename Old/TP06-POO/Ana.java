import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ana {
    public static void main(String[] args) throws IOException {
        String input = "./ana.txt";
        String output = "./sorted.txt";

        FileWriter filew = new FileWriter("./ana.txt", true);
        List<String> array = File_Array(input);
        writeinfile(Array_Hash(array), output);
        // HashMap<String , List<String>>
        
    }

    public static List<String> File_Array (String file) throws IOException {
        List<String> array = new ArrayList();
        try (BufferedReader filer = new BufferedReader(new FileReader(file));){
            String line;
            while ( (line = filer.readLine()) != null) {
                array.add(line);
            }
        }
        return array;
    }

        
    public static HashMap<String, List<String>> Array_Hash(List<String> words) {
        HashMap<String, List<String>> hashmap = new HashMap<>();
        for (String word : words) {
            char[] charofwords = word.toCharArray();
            Arrays.sort(charofwords);   
            String newword = new String(charofwords);
            if (!hashmap.containsKey(newword)) {
                hashmap.put(newword, new ArrayList<>());
            }
            hashmap.get(newword).add(word);

        }


        return hashmap;

    }
    
    public static void writeinfile(HashMap<String, List<String>> hmap , String filew) throws IOException {
        try (BufferedWriter file = new BufferedWriter(new FileWriter(filew))) {
            for (List<String> val : hmap.values()) {
                file.write(val.toString());
                file.newLine();
            }

        }
    }
    
}
