package level1.exercise3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> mapCountries = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("countries.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                mapCountries.put(parts[0], parts[1]);
            }

        } catch (IOException e) {
            System.out.println("Error reading countries file.");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String namePlayer = sc.nextLine();

        List<String> listCountries = new ArrayList<>(mapCountries.keySet());

        int score = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(listCountries.size());
            String randomCountry = listCountries.get(randomIndex);

            System.out.println("What is the capital of " + randomCountry + "?");

            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(mapCountries.get(randomCountry))) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect, the capital is: " + mapCountries.get(randomCountry));
            }
            listCountries.remove(randomCountry);
        }

        System.out.println("Congratulations! Your final score is: " + score + " points.");

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("classification.txt", true))) {

            writer.write(namePlayer + " - " + score + " points");
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error writing classification file.");
        }

        sc.close();


    }
}
