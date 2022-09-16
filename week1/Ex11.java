package week1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        System.out.println("Type a number");
        int userInput = numOne.nextInt();
        int SeconduserInput = numOne.nextInt();

        System.out.println("The largest number of the two numbers is "
                + Math.max(userInput,SeconduserInput));
        }
    }

