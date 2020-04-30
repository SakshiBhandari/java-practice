public class DisplayTriangleOf8 {

    //Using a for loop, display a right triangle of eights, with a base of 10 and a height of 10.

    public static void main(String[] args) throws Exception {
        //write your code here
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}

