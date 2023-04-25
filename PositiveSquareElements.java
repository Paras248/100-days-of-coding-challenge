/*
 * Day 50 coding Statement : Given an integer array of size N. Write Program to find sum of positive square elements in the array.
 */
import java.util.Scanner;

public class PositiveSquareElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += (arr[i] * arr[i]);
        }
        
        System.out.println("Sum: " + sum);
    }
}
