import java.io.*;
import java.util.Scanner;

public class PositiveNegativeNumber {

    //Use the keyboard to enter a number.
    //If the number is positive, then double it.
    //If the number is negative, add one.
    //If the entered number is zero, display zero.
    //Display the result on the screen.

    public static void main(String[] args) throws Exception {

        Scanner value = new Scanner(System.in);
        int number = value.nextInt();

        if (number > 0) {
            number += number;
            System.out.println(number);
        } else if (number < 0) {
            number++; //also tried number = number + 1;
            System.out.println(number);
        } else {
            System.out.println(0);
        }

    }

}
