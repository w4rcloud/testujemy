package java_exercises_1_mz.date_time;

// Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
//LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
//Wyświetl ile czasu minęło pomiędzy datami

import java.time.LocalDate;
import java.time.Period;

public class Zad12 {

    public static void main(String[] args) {
        LocalDate SomePastDate = LocalDate.of(2017, 01, 01);
        LocalDate SomePastDate2 = LocalDate.of(2017, 05, 05);

        System.out.println(Period.between(SomePastDate, SomePastDate2));

            }
}
