
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DisplayOrdinalNumber {

    //Use the keyboard to enter three integers. One of the numbers is unique.
    // The other two are identical.
    // Display the ordinal number of the number that is different from the others

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 == num2 && num1 != num3) {
            System.out.println(3);
        } else if (num1 == num3 && num1 != num2) {
            System.out.println(2);
        } else if (num2 == num3 && num1 != num2) {
            System.out.println(1);
        }


    }
}


