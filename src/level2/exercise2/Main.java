package level2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

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

        List <Restaurant> restaurantList = new ArrayList<>(restaurants);

        Collections.sort(restaurantList);

        System.out.println(restaurantList);



    }
}
