import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Ana {
    public static void main(String[] args) throws IOException {
        String input = "./ana.txt";
        String output = "./sorted.txt";

        FileWriter filew = new FileWriter("./ana.txt", true);
        List<String> array = File_Array(input);
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

    publi
    
    
    
}
