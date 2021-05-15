package exercises;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashmapPractice {

    private static String name;
    private static int studentID;



    public static void main(String[] args) {

        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student id: ");
                Double newGrade = input.nextDouble();
                students.put(newGrade, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Double, String> student : students.entrySet()) {
            System.out.println("Student id: " + student.getKey() + " (" + student.getValue() + ")");
            sum += student.getKey();
        }



    }

}
