import java.io.*;
import java.util.Scanner;

public class DescribingNumbers {

    //Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
    //"even single-digit number" - if the number is even and has one digit,
    //"odd single-digit number" - if the number is odd and has one digit,
    //"even two-digit number" - if the number is even and has two digits,
    //"odd two-digit number" - if the number is odd and has two digits,
    //"even three-digit number" - if the number is even and has three digits,
    //"odd three-digit number" - if the number is odd and has three digits.
    //If the entered number does not fall in the range 1 - 999, don't display anything.

    public static void main(String[] args) throws Exception {

        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num > 0 && num < 10 && (num % 2 == 0)) {
            System.out.print("even single-digit number");
        } else if (num > 0 && num < 10 && (num % 2 != 0)) {
            System.out.println("odd single-digit number");
        } else if (num >= 10 && num < 100 && (num % 2 == 0)) {
            System.out.println("even two-digit number");
        } else if (num >= 10 && num < 100 && (num % 2 != 0)) {
            System.out.println("odd two-digit number");
        } else if (num >= 100 && num <= 999 && (num % 2 == 0)) {
            System.out.println("even three-digit number");
        } else if (num >= 100 && num <= 999 && (num % 2 != 0)) {
            System.out.println("odd three-digit number");
        }

    }
}


