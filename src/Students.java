import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;
import java.io.IOException;

public class Students {

    public void takeInput() throws IOException  {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter an integer");
            int a = scn.nextInt();
            System.out.println("Enter second integer");
            int b = scn.nextInt();


            System.out.printf("The sum is:- "
                    + (a + b));

        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));

        String amount = reader.readLine();

        int amt = Integer.parseInt(amount);

        System.out.println("I will earn $" +amt+ " per hour");



}}

