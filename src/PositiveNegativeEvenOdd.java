
import java.io.*;
import java.util.Scanner;

public class PositiveNegativeEvenOdd {

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num < 0 && (num % 2 == 0)) {
            System.out.print("Negative even number");
        } else if (num < 0 && (num % 2 != 0)) {
            System.out.print("Negative odd number");
        } else if (num > 0 && (num % 2 == 0)) {
            System.out.print("Positive even number");
        } else if (num > 0 && (num % 2 != 0)) {
            System.out.print("Positive odd number");
        } else {
            System.out.print("Zero");
        }
    }
}


