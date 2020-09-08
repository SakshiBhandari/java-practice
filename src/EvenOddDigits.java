import java.io.*;

public class EvenOddDigits {

    //Use the keyboard to enter a number. Determine the number of even digits and odd digits in the entered number.
    //If a number is divisible by 2 without a remainder (i.e. the remainder is zero), then it is even.
    //And we'll increase the even digit counter (static variable even) by 1.
    //Otherwise, the number is odd, so we'll increase the odd digit counter (static variable odd).
    //Display the following message: "Even: a Odd: b", where a is the number of even digits and b is the number of odd digits.

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());

        while (x > 0) {
            if (x % 2 == 0) {
                even++;
                x = x / 10;
            } else {
                odd++;
                x = x / 10;
            }

        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}




