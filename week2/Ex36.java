package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type numbers:");
        Scanner reader = new Scanner(System.in);
        int number;
       // int sum = 0;
        while (true) {
           number = reader.nextInt();
           // sum = sum + number; // sum = sum + number;
            if (number == -1) {
                break;  // end the loop
            }
            System.out.println("Thank you and see you later");
        }
    }
}
