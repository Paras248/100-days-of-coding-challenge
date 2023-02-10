/*
 * Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer 
*/

import java.util.Scanner;

public class ReplaceZerosWithOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp == 0){
                result = (result * 10) + 1;
            } else {
                result = (result * 10) + temp;
            }
            num /= 10;
        }
        num = result; result = 0;
        while(num != 0){
            result = (result * 10) + (num % 10);
            num /= 10;
        }
        System.out.println("Manipulated Number: " + result);
    }
}
