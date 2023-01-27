/*
 * Day 10 coding Statement:  Write a program to find Factorial of a number
*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = num; i >= 1; i--){
            factorial *= i;
        }

        System.out.println("--> " + num + "!: " + factorial);
    }   
}
