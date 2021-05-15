package exercises;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double radius = input.nextDouble();
        double area = 3.1415 * radius * radius;
        input.close();
        System.out.println("The area of a circle with the radius of " + radius + " is " + area);

    }

}
