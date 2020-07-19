package java_exercises_3_sda;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Napisz klasę Cat, która w konstruktorze przyjmować będzie imię kota. Klasa powinna
//        posiadać metodę makeSound, która wypisywać będzie imię kota oraz wydawany przez niego
//        dźwięk.

        System.out.println("***** Zad1 *****");

        Cat bonifacy = new Cat("Bonifacy"); // is 'import lombok.AllArgsConstructor;' forcing to declare all class
        // fields as argument during the creation of an object?

        bonifacy.makeSound();

        // **********
        // Utwórz tablicę kotów, dodaj do niej parę utworzonych obiektów i dla wszystkich wywołaj metodę makeSound

        System.out.println("\n***** Zad2 *****");

        Cat cat1 = new Cat("Mamba");
        Cat cat2 = new Cat("Kitka");
        Cat cat3 = new Cat("Paprotek");

        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        for (Cat cat : catList) {
            cat.makeSound();
        }

        // **********
        // Do klasy Cat dodaj metodę eatMouse, która będzie zliczała zjedzone przez kota myszy i
        //wypisywała komunikat: „Zjadłem X myszy”.

        System.out.println("\n***** Zad3 *****");

        bonifacy.eatMice(2);

        //Napisz klasę Dog, która w konstruktorze przyjmować będzie imię psa. Klasa powinna
//        posiadać metodę makeSound, która wypisywać będzie imię psa oraz wydawany przez niego
//        dźwięk

        System.out.println("\n***** Zad4 *****");

        Dog burek = new Dog("Burek");
        burek.makeSound();

//        Utwórz tablicę zwierząt, dodaj do niej parę utworzonych obiektów typu Cat oraz Dog i dla
//        wszystkich wywołaj metodę makeSound.

        System.out.println("\n***** Zad5 *****");

        Dog dog1 = new Dog("Łupcia");
        Dog dog2 = new Dog("Barca");
        Dog dog3 = new Dog("Tigra");

        List<Animal> animalList = new ArrayList<>();

        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(dog3);
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(cat3);

        for (Animal animal : animalList) {
            animal.makeSound();
        }

//        Napisz interfejs Movable, który będzie zawierał metodę move. Napisz klasę Car
//        implementującą interfejs Movable – w metodzie move ma wypisać komunikat „jadę”.

        System.out.println("\n***** Zad6 *****");

        Car car1 = new Car();
        car1.move();

//        Zmodyfikuj klasę Cat tak, żeby implementowała interfejs Movable – w metodzie move ma
//        wypisać komunikat „idę”.

        System.out.println("\n***** Zad7 *****");

        cat1.move();

//        Utwórz klasę Vet, która będzie miała metodę sayHello przyjmującą jako parametr obiekt
//        klasy Cat i wypisującą powitanie dla tego kota, np. „Witaj Mruczek”.

        System.out.println("\n***** Zad8 *****");

        Vet vet1 = new Vet();
        vet1.sayHello(cat1);

//        W klasie Vet napisz metodę sayHello przyjmującą jako parametr obiekt klasy Dog i
//        wypisującą powitanie dla tego psa, np. „Witaj Burek”.

        System.out.println("\n***** Zad9 *****");

        vet1.sayHello(dog1);

//        Zamiast dwóch wersji metody sayHello napisz jedną, która będzie potrafiła przyjąć w
//        parametrze obiekty klas Cat oraz Dog.

        System.out.println("\n***** Zad10 *****");

        vet1.sayHello(cat2);
        vet1.sayHello(dog2);

//        Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
//        pola i konstruktor oraz metodę getArea - obliczającą pole:
//        1. Prostokąta – wysokość * szerokość
//        2. Koła – Pi * promień * promień
//        3. Trójkąta – ½ * wysokość * podstawa

        System.out.println("\n***** Zad11 *****");

        Circle circle1 = new Circle(2);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Triangle triangle1 = new Triangle(5, 6);

        System.out.println("Area of this circle is: " + circle1.getArea());
        System.out.println("Area of this rectangle is: " + rectangle1.getArea());
        System.out.println("Area of this triangle is: " + triangle1.getArea());

//        Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.

        System.out.println("\n***** Zad12 *****");

        System.out.println("Sum of all 3 figures is: " + sumAreas(circle1.getArea(), rectangle1.getArea(), triangle1.getArea()));

//        Mając podaną powierzchnię X, która może zostać pokryta przez farbę, napisz metodę, która
//        sprawdzi, czy daną ilością farby można zamalować wszystkie podane figury

        System.out.println("\n***** Zad13 *****");

        System.out.println("Amount of paint sufficient to cover anarea of all 3 " +
                "figres (" + sumAreas(circle1.getArea(), rectangle1.getArea(), triangle1.getArea()) +") is enough to " +
                "cover an area of 20: "
                + checkIfAmountOfPaintIsSufficientToCoverArea(20, sumAreas(circle1.getArea(), rectangle1.getArea(), triangle1.getArea())));

        System.out.println("Amount of paint sufficient to cover an area of all 3 " +
                "figres (" + sumAreas(circle1.getArea(), rectangle1.getArea(), triangle1.getArea()) +") is enough to " +
                "cover an area of 40: "
                + checkIfAmountOfPaintIsSufficientToCoverArea(40, sumAreas(circle1.getArea(), rectangle1.getArea(),
                triangle1.getArea())));

//        Napisz klasę Calculator, która będzie miała metodę add, dodającą dwie liczby i zwracającą
//        ich wynik. Metoda ta powinna umieć dodawać liczby zespolone (klasa Complex) oraz liczby
//        naturalne (klasa MyNumber). Jeśli jest taka potrzeba - zmodyfikuj odpowiednio klasy
//        Complex i MyNumber

        System.out.println("\n***** Zad14 *****");
        System.out.println("##########TO BE DONE##########");

        
    }

    //        Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.


    public static double sumAreas(double... areas) {
        double sum = 0;
        for (int i = 0; i < areas.length; i++) {
            sum += areas[i];

        }
        return sum;
    }

    //        Mając podaną powierzchnię X, która może zostać pokryta przez farbę, napisz metodę, która
//        sprawdzi, czy daną ilością farby można zamalować wszystkie podane figury

    public static boolean checkIfAmountOfPaintIsSufficientToCoverArea(double areaToBeCovered, double... areasThatCanBeCoveredByTheAmountOfPaint){
        double areaThatCanBeCoveredByTheAmountOfPaint = 0;
        for (int i = 0; i < areasThatCanBeCoveredByTheAmountOfPaint.length; i++) {
            areaThatCanBeCoveredByTheAmountOfPaint +=areasThatCanBeCoveredByTheAmountOfPaint[i];
        }
        boolean isAmountSufficient = areaToBeCovered <= areaThatCanBeCoveredByTheAmountOfPaint;
        return isAmountSufficient;
    }

}
