public class Loop {

    public void addingTwoUsingWhile() {

        int a = 0;

        while (a <= 10) {
            System.out.println(a);
            a = a + 2;
        }
    }

    //infinite loop function

    public void runInfiniteLoop() {

        boolean bool = true;

        while (bool) {
            System.out.println("One is smaller than two");
            bool = false;

        }
    }
    // for loop

    public void runForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    // int a = arr[0];
    public void printResult( int arr[]){

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + 2);

        }


    }


}

