/*
 * Day 5 coding Statement:  Write a program to identify if the number is even or odd  
*/

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String result = num % 2 == 0 ? "is Even" : "is Odd";
        System.out.println("--> Entered number " + result);
    }
}
