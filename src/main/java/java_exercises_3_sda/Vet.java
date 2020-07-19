package java_exercises_3_sda;

//Utwórz klasę Vet, która będzie miała metodę sayHello przyjmującą jako parametr obiekt
//        klasy Cat i wypisującą powitanie dla tego kota, np. „Witaj Mruczek”.

public class Vet {
    Cat cat;


    public void sayHello(Cat cat){
        System.out.println("Hello " + cat.name);
    }

    //        W klasie Vet napisz metodę sayHello przyjmującą jako parametr obiekt klasy Dog i
//        wypisującą powitanie dla tego psa, np. „Witaj Burek”.

    public void sayHello (Dog dog){
        System.out.println("Hello " + dog.name);
    }

    //        Zamiast dwóch wersji metody sayHello napisz jedną, która będzie potrafiła przyjąć w
//        parametrze obiekty klas Cat oraz Dog.

    public void sayHello (Animal animal) {
        System.out.println("Hello " + animal.name());
    }


}
