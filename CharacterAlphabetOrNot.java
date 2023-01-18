/*
 * Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.
*/

import java.util.Scanner;

public class CharacterAlphabetOrNot {
    private static boolean isAlphabet(char ch){
        return ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("--> Enter character is " + (isAlphabet(ch) ? "an Alphabet" : "not an alphabet"));
    }
}
