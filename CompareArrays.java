/*
 * Day 42 coding Statement : Write Program to check if two arrays are the same or not 
*/

import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size 1: ");
        int size1 = sc.nextInt();
       
        System.out.print("Enter size 2: ");
        int size2 = sc.nextInt();
        
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("Enter first array elements: ");
        for(int i = 0; i < size1; i++) arr1[i] = sc.nextInt();
        System.out.println("Enter second array elements: ");
        for(int i = 0; i < size2; i++) arr2[i] = sc.nextInt();

        if(size1 != size2){
            System.out.println("Arrays don't match");
            return;
        }

        for(int i = 0; i < size1; i++){
            if(arr1[i] != arr2[i]){
                System.out.println("Arrays don't match");
                return;
            }
        }
        System.out.println("Arrays are equal");
    }    
}
