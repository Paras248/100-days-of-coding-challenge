/*
 * Day 13 coding Statement:  Write a program to find Sum of N natural numbers
*/

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for sum of natural numbers:  ");
        int n = sc.nextInt();
        System.out.println("--> Sum of natural number is: " + (n*(n + 1)/2));

    }
}
