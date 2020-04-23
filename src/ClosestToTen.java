public class ClosestToTen {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        int c = 10 - a;
        int d = 10 - b;


        if (abs(c)<= abs(d)) {
            System.out.println(a);

        } else if (abs(d)<= abs(c)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
