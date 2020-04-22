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
        num.calcuteEvenNumber(20);

        // for calculating odd number using switch

        Number n = new Number();
        n.calculateOddNumber();


        // for while Loop

        Loop l = new Loop();
        System.out.println("Starting WHILE LOOP");
        l.addingTwoUsingWhile();
        //l.RunInfiniteLoop();
        System.out.println("starting for LOOP");
        l.runForLoop();
        System.out.println("For loop in an array");
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        l.printResult(a);




    }

    public void printHello2() {
        System.out.println("Hello2");


    }


}