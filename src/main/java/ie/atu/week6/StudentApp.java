package ie.atu.week6;
import java.io.*;
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
                out.println(name); // prints username to file
                out.println(email); // prints email to file
                out.println(studentID); // prints studentID to file
                System.out.println("Saved to:  " + fileName); // saves user information to whatever file they entered
            } catch (IOException ex) {
                System.out.println("Could not write to file: " + ex.getMessage()); // gives the error message if user entered file name wrong
            }
            count++; // increases count each time until the loop ends
        }
        System.out.println("Would you like to review list? y/n: "); // asks user if they would like to review the text on the file they saved everything to
        String review = input.nextLine().trim();

        switch (review) {
            case "y": // if user wants to review the file, these lines will execute
                BufferedReader br = null;
                try
                { //shows the user the information in the file
                    FileReader neverUsed = new FileReader("student.txt");
                    br = new BufferedReader(neverUsed);
                    System.out.println("Contents of students.txt: ");
                    String line;
                    while ((line = br.readLine()) != null)
                    {
                        System.out.println(" - " + line);
                    }
                }
                catch (IOException ex)
                {
                    System.out.println("Could not read file: " + ex.getMessage());
                }
                finally {
                    if (br != null) {
                        try {
                            br.close(); // closes bufferedReader to end close file
                        } catch (IOException CloseEx) {
                            System.out.println("Could not close file: " + CloseEx.getMessage());
                        }
                    }
                }
                break;
            case "n": // if user enters n, the program will close
                System.out.println("Bye!");
                System.exit(0);
                break;
        }
    }
}

