package week3;

public class Ex44 {
     public static int least(int number1, int number2) {
         if ( number1 > number2){
             return number2;
         } else {
             return number1;
         }
     }

     public static void main(String[] args){
         int smallerNumber = least(10, 30);
         System.out.println("Least: " + smallerNumber);
     }

}
