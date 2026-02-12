package level1.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<String, String> mapCountries = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("countries.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            mapCountries.put(parts[0], parts[1]);
        }
        reader.close();

        System.out.println(mapCountries);


    }
}
