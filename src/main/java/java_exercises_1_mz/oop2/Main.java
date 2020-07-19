package java_exercises_1_mz.oop2;

import java_exercises_1_mz.oop.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person2 young = new Person2();
        Person2 johny = new Person2("Johny", "Bravo");
        Person2 anna = new Person2("Anna", "Gunn", 25);
        Person2 old = new Person2("Old", "Lady", 135);

        List<Person2> listOfPersons = new ArrayList<>();
        listOfPersons.add(young);
        listOfPersons.add(johny);
        listOfPersons.add(anna);
        listOfPersons.add(old);


        System.out.println("List size: " + listOfPersons.size());

        if (listOfPersons.isEmpty() == false) {
            System.out.println("First person: " + listOfPersons.get(0).toString());
            System.out.println("Last person: " + listOfPersons.get(listOfPersons.size() - 1).toString());
        }

        System.out.println("Age limit test");
        System.out.println("Test before validation:");

        for (Person2 person : listOfPersons) {
            System.out.println("Person: " + person.toString());
        }
        System.out.println("Test after validation:");

        List<Person2> filteredList = new ArrayList<>();
        filteredList = Validator.filterPeople(listOfPersons);


        for (Person2 person : filteredList) {
            System.out.println("Person: " + person.toString());
        }
    }


}
