/*
 * Day 12 coding Statement:  Write a program to find Sum of digits of a number 
*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get it's sum: ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("--> Sum of digits: " + sum);
    }    
}
