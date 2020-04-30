import java.io.*;
import java.util.Scanner;

public class DisplayRectangleof8 {

    //se the keyboard to enter two numbers m and n.
    //Using a for loop, display an n x m rectangle made of eights.

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print("8");
            }
            System.out.println();
        }

    }
}

