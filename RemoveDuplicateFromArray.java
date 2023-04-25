/*
 * Day 48 coding Statement : Write Program to remove duplicate elements in an array
*/

import java.util.*;


public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        HashSet<Integer> hs = new HashSet<>();

        
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            hs.add(sc.nextInt());
        }

        int[] arr = new int[hs.size()];

        int i = 0;
        for(int ele : hs) {
            arr[i++] = ele;
        }
        
        System.out.println("After removing duplicates: ");
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }

    }
}
