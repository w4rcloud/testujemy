package java_exercises_1_mz.date_time;

import java.time.Clock;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Scratchpad {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Mike");
        namesList.add("Olve");
        System.out.println(namesList.hashCode());
        System.out.println(namesList.indexOf(0));
        System.out.println(namesList.get(1));
        ;
    }

}
