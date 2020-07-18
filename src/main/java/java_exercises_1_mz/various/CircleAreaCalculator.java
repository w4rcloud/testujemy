package java_exercises_1_mz.various;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleAreaCalculator {

    public static double calculateAreaOfACircle(double radius) {
        double area = 0;
        final double pi = Math.PI;
        area = Math.pow(radius, 2) * pi;

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AREA OF A CIRCLE CALCULATOR");
        double radius = 0;
        try {
            System.out.print("Provide radius: ");
            radius = scanner.nextDouble();



            System.out.print("Provide radius: ");
            radius = scanner.nextDouble();

            while (radius <= 0) {
                System.out.println("Radius has to be greater than 0!");
                System.out.print("Provide radius: ");
                radius = scanner.nextDouble();
            }
            System.out.println("Area of a circle with a radius of " + radius + " equals: " + calculateAreaOfACircle(radius));
        } catch (InputMismatchException exception) {
            radius = 1;
            System.out.println("Radius has to be a number");
        } finally {
            System.out.print("Provide radius: ");
            radius = scanner.nextDouble();

            while (radius <= 0) {
                System.out.println("Radius has to be greater than 0!");
                System.out.print("Provide radius: ");
                radius = scanner.nextDouble();
            }
            System.out.println("Area of a circle with a radius of " + radius + " equals: " + calculateAreaOfACircle(radius));
        }
    }
}
