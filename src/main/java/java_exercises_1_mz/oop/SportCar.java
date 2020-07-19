package java_exercises_1_mz.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SportCar extends Car {

    private Engine engine;

    public SportCar(String producer, String model, String color, Engine engine) {
        super(producer, color, model); // Car ("constructor")
        this.engine = engine;
    }

    public SportCar(String producer, String model, String color, Engine engine, int numOfSeats){
        super(producer, color, model, numOfSeats);
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "engine=" + engine +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}

