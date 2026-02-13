package level2.exercise1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Pizza Roma", 8);
        Restaurant r2 = new Restaurant("Pizza Roma", 8);
        Restaurant r3 = new Restaurant("Pizza Roma", 9);
        Restaurant r4 = new Restaurant("Burger King", 8);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);

        System.out.println(restaurants);
    }
}
