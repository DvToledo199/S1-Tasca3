package level1.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

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

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String namePlayer = sc.nextLine();

        List<String> listCountries = new ArrayList<>(mapCountries.keySet());

        int sumaPuntos = 0;

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomIndex = random.nextInt(listCountries.size());
            String randomCountry = listCountries.get(randomIndex);

            System.out.println("What is the capital of " + randomCountry + "?");

            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(mapCountries.get(randomCountry))) {
                sumaPuntos++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect, the capital is: " + mapCountries.get(randomCountry));
            }
            listCountries.remove(randomCountry);
        }

        System.out.println("Congratulations! Your final score is: " + sumaPuntos + " points.");


    }
}
