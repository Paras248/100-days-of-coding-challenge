/*
 * Day 45 coding Statement : Write Program to find smallest and largest element in an array
*/


import java.util.Scanner;

public class SmallestAndLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        System.out.println("Min ele " + min);
        System.out.println("Max ele " + max);

    }
}
