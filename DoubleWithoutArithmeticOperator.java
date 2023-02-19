/*
 * Day 27 coding Statement : Write a program to find the double of the given number without using arithmetic operator
*/

import java.util.Scanner;

public class DoubleWithoutArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Doubled Num: " + (num << 1));
    }
}   
