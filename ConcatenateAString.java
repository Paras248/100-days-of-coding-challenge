/*
 * Day 29 coding Statement : Write a Program to concatenate a string. 
*/

import java.util.Scanner;

public class ConcatenateAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String sec = sc.nextLine();
        System.out.println("ConCatenated String: " + first + sec);
    }
}
