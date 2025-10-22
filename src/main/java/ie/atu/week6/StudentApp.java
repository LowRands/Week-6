package ie.atu.week6;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of students: ");
        int TotalStudents = input.nextInt();
        input.nextLine();

        while (count < TotalStudents) { // will display these prompts the same amount of times as there are students
            System.out.println("Enter the File name (e.g. student.txt): ");
            String fileName = input.nextLine().trim();
            System.out.print("Please enter your name: ");
            String name = input.nextLine().trim();
            System.out.print("Please enter your email: ");
            String email = input.nextLine().trim();
            System.out.print("Please enter Student ID: ");
            String studentID = input.nextLine().trim();

            try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
                out.println(name);
                out.println(email);
                out.println(studentID);
                System.out.println("Saved to:  " + fileName);
            } catch (IOException ex) {
                System.out.println("Could not write to file: " + ex.getMessage());
            }
            count++;
        }
    }
}
