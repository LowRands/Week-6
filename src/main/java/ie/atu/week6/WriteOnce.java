package ie.atu.week6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteOnce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the File name (e.g. students.txt): ");
        String fileName = scan.nextLine().trim();

        System.out.println("Enter a name to save: ");
        String name = scan.nextLine().trim();

        try {
            PrintWriter out = new PrintWriter(new FileWriter(fileName, true));
           out.println(name);
           System.out.println("Saved to:  " + fileName);
        }
        catch(IOException ex){
            System.out.println("Could not write to file: " + ex.getMessage());
        }
    }
}
