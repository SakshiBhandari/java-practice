import java.io.*;
import java.util.Scanner;

public class NegativePositiveNumber {


    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int countPositive = 0;
        int countNegative = 0;

        int a[] = {num1, num2, num3};

        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0) {
                countPositive++;

            } else if (a[i] < 0) {
                countNegative++;
            }

        }
        System.out.println("Number of positive numbers: " + countPositive);
        System.out.println("Number of negative numbers: " + countNegative);

    }
}


