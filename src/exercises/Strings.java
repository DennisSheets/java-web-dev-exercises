package exercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;


public class Strings {

    public static void main(String[] args) {

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";
        int sentenceLength = sentence.length();

        String newSentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        String word = input.nextLine();
        int wordLength = word.length();

        Boolean isTrue = newSentence.contains(word.toLowerCase());

        if (isTrue) {

            int index = newSentence.indexOf(word.toLowerCase());
            System.out.println(word + " was found was found at index " + index + " with a length of " +wordLength + " and then removed");
            String finalSentence = newSentence.replaceFirst(word.toLowerCase(), "");
            int finalSentenceLength = finalSentence.length();
            System.out.println("\n");
            System.out.println("Original sentence length was " + sentenceLength + " now the length is " + finalSentenceLength);
            System.out.println("\n");
            System.out.print(newSentence);
            System.out.println("\n");
            System.out.print(finalSentence);
        } else {
            System.out.println(word + " was not found");
        }


    }

}
