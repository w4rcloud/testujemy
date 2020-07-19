package java_exercises_3_sda;

//Napisz klasę Dog, która w konstruktorze przyjmować będzie imię psa. Klasa powinna
//        posiadać metodę makeSound, która wypisywać będzie imię psa oraz wydawany przez niego
//        dźwięk

public class Dog implements Animal{

    String name;

    public Dog(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println(name + ": Woof");
    }

    @Override
    public String name() { // Class 'Cat' must either be declared abstract or implement abstract method 'name()' in 'Animal'
        return name;       // Line 26-29 have been created by IntelliJ for the purpose of Vet.sayHello(Animal) method
            }
}
