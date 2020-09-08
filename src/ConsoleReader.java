import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Make the ConsoleReader class, which will have 4 static methods:
String readString() - reads a string from the keyboard
int readInt() - reads a number from the keyboard
double readDouble() - reads a fractional number from the keyboard
boolean readBoolean() - reads the string "true" or "false" from the keyboard and returns the corresponding boolean value (true or false)

Please note: In each method, create a variable to read data from the console (BufferedReader or Scanner).
 */

public class ConsoleReader {

    public static String readString() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString = reader.readLine();
        return readString;

    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readInt = Integer.parseInt(reader.readLine());
        return readInt;
    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double readDouble = Double.parseDouble(reader.readLine());
        return readDouble;
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean readBoolean = Boolean.parseBoolean(reader.readLine());
        return readBoolean;
    }

    public static void main(String[] args) throws Exception {

    }
}


