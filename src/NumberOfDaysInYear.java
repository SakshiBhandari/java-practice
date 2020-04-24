import java.io.*;

public class NumberOfDaysInYear {

    public static void main(String[] args) throws Exception {

        //Use the keyboard to enter a year, and then determine the number of days in the year. Display the result as follows:
        //1) if the year is evenly divisible by 400, then it is a leap year;
        //2) for other years, if the year is evenly divisible by 100, then it is a regular year;
        //3) for other years, if the year is evenly divisible by 4, then it is a leap year;
        //4) all remaining years are not leap years.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int year = Integer.parseInt(num);

        int x;

        if (year % 400 == 0) {
            x = 366;
            System.out.println("Number of days in the year: " + x);
        } else if (year % 100 == 0) {
            x = 365;
            System.out.println("Number of days in the year: " + x);
        } else if (year % 4 == 0) {
            x = 366;
            System.out.println("Number of days in the year: " + x);
        } else {
            x = 365;
            System.out.println("Number of days in the year: " + x);
        }

    }
}
