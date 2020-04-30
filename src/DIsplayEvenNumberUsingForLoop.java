public class DIsplayEvenNumberUsingForLoop {

    //Use a for loop to display even numbers from 1 to 100 inclusive.
    //Display each value on a new line.

    public static void main(String[] args) throws Exception {
        //write your code here
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

    }
}


