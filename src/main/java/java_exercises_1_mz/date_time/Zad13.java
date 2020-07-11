package java_exercises_1_mz.date_time;

// Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
//LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
//czasu upłynęło pomiędzy godzinami

import java.time.Duration;
import java.time.LocalTime;

public class Zad13 {

    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.of(14,11,00);
        LocalTime localTime2 = LocalTime.of(18, 41, 00);

        System.out.println(Duration.between(localTime1, localTime2));
        System.out.println(Duration.between(localTime1, localTime2).toString());

    }
}
