package java_exercises_1_mz.oop;

public class Rectangle extends Figure {
    float sideA;
    float sideB;

    Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float countArea() {
        float area = 0;
        area = sideA * sideB;
        return area;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Rectangle, area: " + countArea());
    }


}


