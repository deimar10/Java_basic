package week3;

public class Ex45 {
public static int greatest(int number1, int number2, int number3){
     if (number1 > number2 && number1 > number3) {
        return number1;
    } if (number2 > number3 && number2 > number3) {
         return number2;
        } else {
         return number3;
        }
    }

    public static void main(String[] args) {
        int answer = greatest(10,5,3);
        System.out.println(answer);
    }
}
