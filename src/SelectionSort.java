import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SelectionSort {


    public static void main(String[] args) throws Exception {

        System.out.println("Enter first number:");

        Scanner num = new Scanner(System.in);
        int n1 = num.nextInt();
        System.out.println("Enter second number:");
        int n2 = num.nextInt();
        System.out.println("Enter third number:");
        int n3 = num.nextInt();

        int arr[] = {n1, n2, n3}; // array declared
        int i;
        int j;


        //selection sort descending numbers
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) { //nested loop
                if (arr[i] < arr[j]) {
                    //swapping numbers
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");

            }
            System.out.println();
        }
        System.out.println("Printing the final array:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

