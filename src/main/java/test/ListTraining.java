package test;

import java.util.*;

public class ListTraining {

    public static void exList() {
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Mike");
        listOfNames.add("Julia");
        listOfNames.add("Borys");

        System.out.println(listOfNames.size());

        listOfNames.add("Ania");
        System.out.println(listOfNames.size());
    }

    public static void exMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bernard");
        map.put(2, "Tyberiusz");
        map.put(3, "Tytus");
        System.out.println(map.get(2));
        System.out.println(map.size());
        map.put(2, "Maja");
        System.out.println(map.get(2));
        System.out.println(map.size());

    }

    public static void exSet(){
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("aab");
        set.add("aac");
        System.out.println(set.size());

    }


    public static void main(String[] args) {
        exList();
        exMap();
        exSet();
    }
}
