/*
 * Day 28 coding Statement : Write a Program to reverse a string.  
*/

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder str = new StringBuilder(sc.next());
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(len - 1 - i));
            str.setCharAt(len - 1 - i, temp);    
        }
        System.out.println("Reversed String: " + str.toString());
    }
}
