package level1.exercise2;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){

        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);

        List<Integer> numbers2 = new ArrayList<>();

        ListIterator<Integer> iterator = numbers1.listIterator(numbers1.size());

        while (iterator.hasPrevious()) {
            Integer value = iterator.previous();
            numbers2.add(value);
        }



    }
}
