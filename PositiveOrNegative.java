/*
 * Day 4 coding Statement:  Write a program to identify of the a number is positive or negative 
*/

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("--> Entered Number is " + (num > 0 ? "Positive" : "Negative"));
    }
}