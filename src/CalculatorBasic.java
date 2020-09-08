public class CalculatorBasic {

/*Make a Calculator class, which will have 5 static methods:
-int plus(int a, int b) - returns the sum of a and b
-int minus(int a, int b) - returns the difference between a and b
-int multiply(int a, int b) - returns the product of a and b
-double divide(int a, int b) - returns the result of dividing a by b
-double percent(int a, int b) - returns b percent of the number a */

    public static int plus(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static int minus(int a, int b) {
        int result;
        result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result;
        result = a * b;
        return result;
    }

    public static double divide(int a, int b) {
        double result;
        result = ((double) a / (double) b);
        return result;
    }

    public static double percent(int a, int b) {
        double result;
        result = ((double) b / 100) * (double) a;
        return result;
    }

    public static void main(String[] args) {

    }
}
