import java.io.*;
import java.util.Scanner;

public class MinimumNumber {

    //Use the keyboard to enter two integers, and display the minimum. If the two numbers are equal, display either of them.

    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        int number1 = num.nextInt();
        int number2 = num.nextInt();

        if (number1 <= number2) {
            System.out.println(number1);
        } else if (number2 <= number1) {
            System.out.println(number2);
        } else {
            System.out.println(number1);
        }
    }
}

