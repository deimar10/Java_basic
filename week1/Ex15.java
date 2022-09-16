package week1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        int userInput = age.nextInt();
        if (userInput < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}
