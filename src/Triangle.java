
import java.io.*;
import java.io.IOException;
import java.lang.NumberFormatException;


public class Triangle {

    public static void main(String[] args) throws Exception {
        //write your code()
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);

        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        if (a1 + b1 > c1 && a1 + c1 > b1 && b1 + c1 > a1) {

            System.out.println("The triangle is possible.");
        } else {
            System.out.println("The triangle is not possible.");
        }

    }
}


