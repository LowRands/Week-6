package ie.atu.week6;

import java.util.Scanner;

public class TryBefore
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        while(true) {
            System.out.println("Enter your age: ");
            String text = scan.nextLine().trim();


            try {
                age = Integer.parseInt(text);
                System.out.println("You entered age: " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input " + e.getMessage());
            }
        }
    }
}
