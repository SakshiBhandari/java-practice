import java.io.*;

public class DisplayDollarSignUsingWhile {

    //Use a while loop to display a 10x10 square of dollar signs.
    //Don't separate the symbols in each line.

    public static void main(String[] args) throws Exception {
        //write your code here
        int a = 10;
        int b = 10;

        while (a > 0) {
            while (b > 0) {
                System.out.print("$");
                b--;
            }
            b = 10;
            System.out.println("");
            a--;
        }

    }
}


