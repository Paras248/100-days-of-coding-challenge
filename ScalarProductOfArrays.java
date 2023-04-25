
/* 
 * Day 49 coding Statement : Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.
*/

import java.util.Scanner;

public class ScalarProductOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of arrays : ");
        int size = sc.nextInt();
        
        int[] arrOne = new int[size];
        int[] arrTwo = new int[size];
        
        System.out.println("Enter elements of array one: ");
        for(int i = 0; i < size; i++){
            arrOne[i] = sc.nextInt();
        }

        System.out.println("Enter elements of array two: ");
        for(int i = 0; i < size; i++){
            arrTwo[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += arrOne[i] * arrTwo[size - 1 - i];
        }
        
        System.out.println("Sum: " + sum);
    }
}
