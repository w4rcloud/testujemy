package java_exercises_1_mz.oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car { //no object can be made
    protected String producer; //private - no access after inheritance  - getters/setters needed
    protected String model; // access after inheritance
    protected String color;
    protected int numberOfSeats;


    public Car() {

        this.numberOfSeats = 2;
    }

    public Car(String producer, String model, String color){
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.numberOfSeats = 2;
    }

    public Car(String producer, String model, String color, int numberOfSeats){
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

}
