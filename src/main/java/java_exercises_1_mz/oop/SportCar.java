package java_exercises_1_mz.oop;

public class SportCar extends Car {
//    public SportCar(String producer, String model, String color, int numberOfSeats, Engine engine) {
//        this.producer = producer;
//        this.model = model;
//        this.color = color;
//        this.numberOfSeats = numberOfSeats;
//        this.engine = engine;
//    }

    public SportCar(String producer, String model, String color, int numberOfSeats, Engine engine) {
        super(producer, color, model);
            this.producer = producer;
            this.model = model;
            this.color = color;
        }

    }

