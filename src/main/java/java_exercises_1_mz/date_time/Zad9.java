package java_exercises_1_mz.date_time;

// Wykorzystując obiekt typu LocalTime wyświetl aktualny czas

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Zad9 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);
    }


}
