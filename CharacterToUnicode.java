/*
 * Day 3 coding Statement: Write a program to find ASCII values of a character
*/

import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a character: ");
          char ch = sc.next().charAt(0);
          System.out.println("--> The unicode for given character is " + (int) ch);     
    }
}
