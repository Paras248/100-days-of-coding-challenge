/*
 * Day 52 coding Statement : Given an integer array of size N, write a program to reverse the array;
 */

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size / 2; i++){
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        System.out.println("AFTER REVERSING: ");        
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}
