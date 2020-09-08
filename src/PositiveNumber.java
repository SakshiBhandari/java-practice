import java.io.*;
import java.util.Scanner;

public class PositiveNumber {


    public static void main(String[] args) throws Exception {
        System.out.println("Enter first number");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        System.out.println("Enter third number");
        int num3 = s.nextInt();

        int count = 0;
        int a[] = {num1, num2, num3};

        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0) {
                count++;
            }

        }
        System.out.println("Positive number:" + count);
    }
}


