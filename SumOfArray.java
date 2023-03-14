/*
 * Day 46 coding Statement : Write Program to find sum of elements in an array 
*/

import java.util.Scanner;

public class SumOfArray {
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
            sum += arr[i];
        }
        
        System.out.println("Sum: " + sum);
    }
}
