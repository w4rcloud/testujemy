package java_exercises_1_mz.oop;

public abstract class Car {
    String producer;
    String model;
    String color;
    int numberOfSeats;
    Engine engine;

    Car() {
        this.numberOfSeats = 2;
    }

    public Car(String producer, String model, String color){
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

}
