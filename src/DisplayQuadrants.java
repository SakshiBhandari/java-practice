import java.io.*;
import java.util.Scanner;

public class DisplayQuadrants {

    //Use the keyboard to enter two integers representing the coordinates of a point not on the coordinate axes.
    //Display the number of the quadrant that contains the given point.

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else if (a > 0 && b < 0) {
            System.out.println(4);
        }
    }
}


