package exercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static ArrayList<Integer> numbers = new ArrayList<>();


    private static String string = "I would not, could not, in a box." +
            " I would not, could not with a fox." +
            " I will not eat them in a house." +
            " I will not eat them with a mouse.";

    private static String[] words = string.replaceAll("\\.","").replaceAll("\\,","").split(" ");

    private static int sumEven() {
        int evenTotal = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenTotal += number;
                //System.out.println(number + ": is EVEN");
            } else {
                //System.out.println(number + ": is ODD");
            }
        }
        return evenTotal;
    }

    private static void wordSearch(String searchTerm){
        for (String word : words){
            if(word.length() == 4){
                System.out.println(word);
            }
        }
    }


    public static void main(String[] args) {

        numbers.add(1);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(16);
        numbers.add(616);
        numbers.add(15);
        numbers.add(81);
        numbers.add(166);
        numbers.add(931);
        System.out.println("\nevenTotal: " + sumEven());

        System.out.println("****************");
        System.out.println(Arrays.toString(words));

        Scanner input = new Scanner(System.in);

        System.out.println("word length to search for: ");
        String word = input.nextLine();
        wordSearch(word);








    }

}
