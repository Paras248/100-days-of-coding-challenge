/*
 * Day 44 coding Statement : Write Program to find number of even and odd elements in an array  
*/

import java.util.Scanner;

public class CountEvenAndOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int oddCount = 0, evenCount = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even count " + evenCount);
        System.out.println("Odd count " + oddCount);

    }
}
