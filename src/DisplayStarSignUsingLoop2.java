public class DisplayStarSignUsingLoop2 {


    public static void main(String[] args) {

        for (int row = 1; row <= 4; row++) {
            for (int j = 4; j >= row; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}



