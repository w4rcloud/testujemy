package java_exercises_1_mz.date_time;

// Wyświetl bieżącą datę i godzinę w Tokyo

import java.time.Clock;
import java.time.ZoneId;

public class Zad14 {

    public static void main(String[] args) {

        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        System.out.println(clock);
    }


}
