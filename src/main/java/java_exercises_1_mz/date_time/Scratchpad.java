package java_exercises_1_mz.date_time;

import java.time.Clock;
import java.time.ZoneId;

public class Scratchpad {

    public static int[] minusCounter(int[] in){
        int counter = 0;
        for(int number: in ){
            if (number < 0) counter++;
        }

        int[] out = new int[counter];
        int it = 0;
        for (int number: in){
            if (number < 0){
                out[it] = number;
                it ++;
            }
        }
        System.out.println("Out table");
        //TablePrinter.tablesPrinter(out);
        System.out.println("Counter result: " + counter);
        return out;

    }
}