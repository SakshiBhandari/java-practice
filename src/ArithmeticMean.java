import java.io.*;

public class  ArithmeticMean {

    //Use the keyboard to enter numbers, and then calculate the arithmetic mean.
    //If the user enters -1, display the arithmetic mean of all entered numbers and end the program.
    //-1 should not be included in the calculation.



    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers:");

        int count = 0;
        double average = 0;
        double sum = 0;


        while (true)     {
            int number = Integer.parseInt(reader.readLine());
            if (number != -1) {

                sum = sum + number;
                count = count + 1;

            } else if (number == -1) {
                average = sum / count;
                System.out.println(average);
                break;
            }


        }
    }
}

s

