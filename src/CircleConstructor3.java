public class CircleConstructor3 {

    /*Correct the constructor with two parameters so that it calls another constructor with a radius of 10.
Think about which constructor you need to call.

Hint:
carefully study the implementation of the default constructor. */

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleConstructor3(double x, double y) {

        this(x, y, 10);


    }

    public CircleConstructor3() {  //default constructor
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        CircleConstructor3 circle = new CircleConstructor3();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        CircleConstructor3 anotherCircle = new CircleConstructor3(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}


