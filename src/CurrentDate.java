import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

//Display the current date in the following format: "06 15 2018".


public class CurrentDate {

    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("MM dd yyyy");

        String currentdate = f1.format(date);

        System.out.println(currentdate);


    }
}

