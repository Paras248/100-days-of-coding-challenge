
/*
 * Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string 
*/

import java.util.Scanner;

public class CapitalizeFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder str = new StringBuilder(sc.next());
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        str.deleteCharAt(0);
        str.deleteCharAt(str.length() - 1);
        str.insert(0, Character.toUpperCase(first));
        str.insert(str.length(), Character.toUpperCase(last));
        System.out.println("Result: " + str);
    }
}
