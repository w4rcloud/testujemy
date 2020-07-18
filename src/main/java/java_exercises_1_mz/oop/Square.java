package java_exercises_1_mz.oop;

public class Square extends Figure {
    float side;

    Square(float side){
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public int setSide(int side) {
        this.side = side;
        return 0;
    }

    @Override
    public float countArea() {
        float area = 0;
        area = side*side;
        return area;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Square, area: " + countArea());
    }
}
