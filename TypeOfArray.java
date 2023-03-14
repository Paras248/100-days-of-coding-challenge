/*
 * Day 43 coding Statement : Write Program to find the array type 
*/

import java.util.Scanner;

public class TypeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        boolean isOdd = false, isEven = false;
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                isEven = true;
            } else {
                isOdd = true;
            }
        }

        if(isOdd && !isEven) System.out.println("Array is of type odd");

        if(isEven && !isOdd) System.out.println("Array is of type even");
        
        if(isEven && isOdd) System.out.println("Array is of mixed type");
    }

}
