package java_exercises_3_sda;

//        Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
//        pola i konstruktor oraz metodę getArea - obliczającą pole:
//        1. Prostokąta – wysokość * szerokość
//        2. Koła – Pi * promień * promień
//        3. Trójkąta – ½ * wysokość * podstawa

public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        double area = height * width;
        return area;
    }
}


