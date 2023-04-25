/*
 * Day 51 coding Statement : Given an integer array of size N, write a program to sort the array;
 */

import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted array: ");
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
        
    }   
}
