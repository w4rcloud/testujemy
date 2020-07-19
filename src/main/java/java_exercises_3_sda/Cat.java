package java_exercises_3_sda;

//Napisz klasę Cat, która w konstruktorze przyjmować będzie imię kota. Klasa powinna
//        posiadać metodę makeSound, która wypisywać będzie imię kota oraz wydawany przez niego
//        dźwięk.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter


public class Cat implements Animal, Movable {

    String name;


    public void makeSound() {
        System.out.println(this.name + ": Meow");
    }

    @Override
    public String name() {  // Class 'Cat' must either be declared abstract or implement abstract method 'name()' in 'Animal'
        return name;        // Line 26-29 have been created by IntelliJ for the purpose of Vet.sayHello(Animal) method
    }

//    Do klasy Cat dodaj metodę eatMouse, która będzie zliczała zjedzone przez kota myszy i
//    wypisywała komunikat: „Zjadłem X myszy”.

    public void eatMice(int noOfMice) {   //static, because it doesn't affect any of the Class' attributes?
        System.out.println("I ate " + noOfMice + " mice");
    }

//    Zmodyfikuj klasę Cat tak, żeby implementowała interfejs Movable – w metodzie move ma
//    wypisać komunikat „idę”.

    @Override
    public void move() {
        System.out.println("I am walking.");
    }
}
