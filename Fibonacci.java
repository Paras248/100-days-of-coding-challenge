/*
 * Day 11 coding Statement:  Write a program to find Fibonacci series up to n
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a fibonacci series: ");
        int num = sc.nextInt();
        
        int numOne = 0, numTwo = 1, sum = 0;

        for(int i = 0; i < num; i++){
            sum = numOne + numTwo;
            numOne = numTwo;
            numTwo = sum;
        }

        System.out.println("--> The result of fibonacci: " + sum);
    }   
}
