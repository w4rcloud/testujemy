package java_exercises_1_mz.oop;

public class Circle extends Figure {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float countArea() {
        float area = 0;
        float pi = (float) Math.PI;
        area = (float) (Math.pow((float) radius, (float) 2.0) * pi);
        return area;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Circle, area: " + countArea());

    }
}
