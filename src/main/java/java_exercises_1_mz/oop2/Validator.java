package java_exercises_1_mz.oop2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Validator {

    public static List<Person2> filterPeople(List<Person2> listToBeFiltered){ //static bo bierze cos i zwraca cps
        List<Person2> filteredList = new LinkedList<>();
        for (Person2 person : listToBeFiltered) {
            if (person.getage() <= Person2.MAX_AGE){
                filteredList.add(person);
            }
        }
        return filteredList;
    }

}
