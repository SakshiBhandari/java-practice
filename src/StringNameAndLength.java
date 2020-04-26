import java.io.*;

public class StringNameAndLength {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String name1 = read.readLine();
        String name2 = read.readLine();

        int name1Length = name1.length();
        int name2Length = name2.length();

        if (name1 == name2) {
            System.out.println("The names are identical");
        } else if (name1 != name2 && name1Length == name2Length) {
            System.out.println("The names are the same length");
        }

    }

}

