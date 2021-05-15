package areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159255853;
        double radius = 0;
        double area = 0;
        boolean isValid = false;

        do {
            System.out.println("What is the radius of your circle?");

            if(input.hasNextDouble()) {
                radius = input.nextDouble();
                area = pi * radius * radius;
                isValid = true;
            } else {
                isValid = false;
                System.out.println("Invalid entry! Enter only a number!");
                input.nextLine();

            }
        } while (!isValid);








        System.out.println("The area of a circle of radius " + radius + "is: " + area);
        System.out.println("The area of a circle of radius " + radius + "is: " + Circle.getArea(radius));

    }

}
