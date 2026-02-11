package level1.exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){


        Month jan = new Month("January");
        Month feb = new Month("February");
        Month mar = new Month("March");
        Month apr = new Month("April");
        Month may = new Month("May");
        Month jun = new Month("June");
        Month jul = new Month("July");
        Month aug = new Month("August");
        Month sep = new Month("September");
        Month oct = new Month("October");
        Month nov = new Month("November");
        Month dec = new Month("December");

        ArrayList<Month> months = new ArrayList<>();

        months.add(jan);
        months.add(feb);
        months.add(mar);
        months.add(apr);
        months.add(may);
        months.add(jun);
        months.add(jul);
        months.add(sep);
        months.add(oct);
        months.add(nov);
        months.add(dec);


    }
}
