public class Number {

    public void calcuteEvenNumber(int number) {

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public void calculateOddNumber() {

        int number = 3;
        switch (number){
            case 1:
                System.out.println("Number is even");
                break;
            case 3:
                System.out.println("Number is odd");
                break;
             default:
                 System.out.println("I dont have an answer");
        }

    }
}
