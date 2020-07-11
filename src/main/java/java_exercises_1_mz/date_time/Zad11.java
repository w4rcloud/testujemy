package java_exercises_1_mz.date_time;

// Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę

import java.time.LocalDateTime;

public class Zad11 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());
    }
}
