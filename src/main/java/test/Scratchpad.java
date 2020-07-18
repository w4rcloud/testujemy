package test;

import java.lang.reflect.Array;
import java.time.Clock;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.math.*;

public class Scratchpad {


    public static void main(String[] args) {



        HashSet uniqueRandomNumberGenerator = new HashSet();
        while (uniqueRandomNumberGenerator.size() < 10) {
            int num = (int) (Math.random() * 100);
            uniqueRandomNumberGenerator.add(num);
        }
        Iterator it = uniqueRandomNumberGenerator.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}