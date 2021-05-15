package exercises;

import java.util.Arrays;


public class ArrayPractice {

    private static Object ArrayList;

    public static void main(String[] args) {

        int[] numbers = {1,1,2,3,5,8};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("***************");

        for (int number : numbers) {
            if (number%2 != 0) {
                System.out.println(number);
            }
        }

        String string = "I would not, could not, in a box." +
                " I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse.";

        String[] words = string.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = string.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }

}
