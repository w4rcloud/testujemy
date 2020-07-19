package java_exercises_3_sda;

//        Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
//        pola i konstruktor oraz metodę getArea - obliczającą pole:
//        1. Prostokąta – wysokość * szerokość
//        2. Koła – Pi * promień * promień
//        3. Trójkąta – ½ * wysokość * podstawa

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Triangle {
    double height;
    double base;

    public double getArea(){
        double area = (height * 0.5) * base;
        return area;
    }

}
