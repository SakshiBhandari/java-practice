import java.io.*;

public class MultiplicationTableUsingWhile {

    //Use a while loop to display a 10x10 multiplication table.
    //Separate the numbers using a space.


    public static void main(String[] args) throws Exception {
        //write your code here
        int row = 1;
        int col = 1;

        while (row <= 10) {
            while (col <= 10) {
                System.out.print(row * col + " ");
                col++;
            }
            System.out.println();
            col = 1;
            row++;
        }

    }
}


