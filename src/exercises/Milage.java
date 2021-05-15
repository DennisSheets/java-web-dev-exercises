package exercises;

import java.util.Scanner;

public class Milage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        double miles = input.nextDouble();
        System.out.println("How many gallons did you use");
        double gallons = input.nextDouble();
        double mileage = miles/gallons;

        System.out.println("Your average miles per gallon for this trip is " + mileage);


    }

}
