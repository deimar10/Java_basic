package week1;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Type your username:");
        String userName = user.nextLine();
        System.out.println("Type your password:");
        String password = user.nextLine();
        if ((userName.equals("alex"))) {
            System.out.println("You are now logged into the system!");
            if ((password.equals("qwerty"))) {
            }
        } else System.out.println("Your username or password was invalid");
    }
}
