import java.io.*;
import java.util.Scanner;

public class MaximumOfFour {
    //Use the keyboard to enter four numbers, and display the maximum of them. If the maximum occurs more than once, just display it once.

    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int n3 = num.nextInt();
        int n4 = num.nextInt();

        if (n1 >=n2 && n1 >= n3 && n1 >= n4) {
            System.out.println(n1);
        } else if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
            System.out.println(n2);
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
            System.out.println(n3);
        } else if (n4 >= n1 && n4 >= n2 && n4 >= n3) {
            System.out.println(n4);
        }

    }
}


