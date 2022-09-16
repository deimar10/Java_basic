package week3;

import java.util.Scanner;

public class Ex69 {
    public static boolean palindrome(String text) {
       String str = text, nstr="";
       char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr = ch+nstr; //adds each character in front of the existing string
        }
        return nstr.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}




