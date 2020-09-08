import java.io.*;

public class BMICalculator {

    /*Body mass index.
Implement a static method in the Body class. The method should calculate the body mass index and display the following message:
"Underweight: BMI < 18.5" - if the body mass index is less than 18.5,
"Normal: 18.5 <= BMI < 25" - if the body mass index is between 18.5 and 25 (not inclusive),
"Overweight: 25 <= BMI < 30" - if the body mass index is between 25 and 30 (not inclusive),
"Obese: BMI >= 30" - if the body mass index is 30 or more */

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            // write your code here
            double BMI;
            BMI = weight / (height * height);

            if (BMI < 18.5) {
                System.out.println("Underweight: BMI < 18.5");
            } else if ((18.5 <= BMI) && (BMI < 25.0)) {
                System.out.println("Normal: 18.5 <= BMI < 25");
            } else if ((25 <= BMI) && (BMI < 30.0)) {
                System.out.println("Overweight: 25 <= BMI < 30");
            } else {
                System.out.println("Obese: BMI >= 30");

            }
        }
    }
}


