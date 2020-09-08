public class DistanceBetween2points {

/*
mplement the static double getDistance(x1, y1, x2, y2) method. It should calculate the distance between two points.
Use the double Math.sqrt(double a) method, which calculates the square root of the passed argument.
 */
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        int x = x1 - x2;
        int y = y1 - y2;
        double z = (x * x) + (y * y);
        z = Math.sqrt(z);
        return z;
    }

    public static void main(String[] args) {

        DistanceBetween2points.getDistance(2, 4, 6, 8);
    }

}


