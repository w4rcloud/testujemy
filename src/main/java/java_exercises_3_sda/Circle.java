package java_exercises_3_sda;

//        Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
//        pola i konstruktor oraz metodę getArea - obliczającą pole:
//        1. Prostokąta – wysokość * szerokość
//        2. Koła – Pi * promień * promień
//        3. Trójkąta – ½ * wysokość * podstawa

public class Circle {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
    }
}
