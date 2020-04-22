import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // learning static

        System.out.println(Person.name);
        Person.printHello();

        System.out.println(Math.PI);  //sout+tab


        Main m = new Main();
        m.printHello2();


        // for class Number (calculating odd even)

        Number num = new Number();
        num.calcuteEvenNumber(19);
    }

    public void printHello2() {
        System.out.println("Hello2");


    }


}