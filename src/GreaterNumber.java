import java.io.*;

public class GreaterNumber {

    //Write a program that:
    //1. reads a number N (must be greater than 0) from the console
    //2. reads N numbers from the console
    //3. Displays the maximum of the N entered numbers.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(reader.readLine());


        int maximum = Integer.MIN_VALUE;
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (maximum < number) {
                    maximum = number;
                }
            }

            System.out.println(maximum);


        }
    }
}

