/* Code to write a Java Program to accept 10 numbers in an array and compute the square 
of each number. Print the sum of these numbers.  */

import java.util.*;

public class Exp3_2 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = Sc.nextInt();
        int arr[] = new int[n];
        int sq = 0, sum = 0;
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Square of each number is:");
        for (int i = 0; i < n; i++) {
            sq = arr[i] * arr[i];
            sum = sum + sq;
            System.out.println(sq);
        }
        System.out.println("Sum of square of numbers =" + sum);
    }
}
