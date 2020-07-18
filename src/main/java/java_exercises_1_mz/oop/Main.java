package java_exercises_1_mz.oop;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static int uniqueRandomNumberGenerator(int noOfNumbers) {
        HashSet uniqueRandomNumberSet = new HashSet();
        Object[] randomNumberArray;
        int randomNumber = 0;
        while (uniqueRandomNumberSet.size() < noOfNumbers) {
            int num = (int) (Math.random() * 100);
            uniqueRandomNumberSet.add(num);

        }
        randomNumberArray = uniqueRandomNumberSet.toArray();
        randomNumber = (int) randomNumberArray[ThreadLocalRandom.current().nextInt(0, noOfNumbers)];
        return randomNumber;
    }

    public static void main(String[] args) {
        Person mike = new Person("Mike", "Wro", 33);
        mike.introduceSelf();

        Rectangle myRectangle = new Rectangle(10, 12);
        myRectangle.displayArea();

        Square mySquare = new Square(2);
        mySquare.displayArea();

        Circle myCircle = new Circle(2);
        myCircle.displayArea();

        System.out.println("**************************");

        Rectangle myRandomRectangle = new Rectangle((int) uniqueRandomNumberGenerator(1),
                (int) uniqueRandomNumberGenerator(1));

        Square myRandomSquare = new Square(1);

        Circle myRandomCircle = new Circle((int) uniqueRandomNumberGenerator(1));

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rectangles? ");
        int noOfRectangles = scanner.nextInt();
        System.out.print("How many squares? ");
        int noOfSquares = scanner.nextInt();
        System.out.print("How many circles? ");
        int noOfCircles = scanner.nextInt();

        List<Figure> listOfFigures = new ArrayList<>();
        for (int i = 0; i < noOfRectangles; i++) {
            listOfFigures.add(i, myRandomRectangle);
        }
        for (int i = noOfRectangles; i < noOfRectangles + noOfSquares; i++) {
            myRandomSquare.setSide(uniqueRandomNumberGenerator(1));
            listOfFigures.add(i, myRandomSquare);

        }
        for (int i = noOfRectangles + noOfSquares; i < noOfRectangles + noOfSquares + noOfCircles; i++) {
            listOfFigures.add(i, myRandomCircle);
        }

        System.out.println(listOfFigures.size());
        for (int i = 0; i < listOfFigures.size(); i++) {
            listOfFigures.get(i).displayArea();

        }



    }

}

