/*
 * Day 1 coding Statement : Write a program to identify if the character is a vowel or consonant.
*/

import java.util.Scanner;

public class CharacterVowelOrConsonant {
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check whether it is vowel or not: ");
        char ch = sc.next().charAt(0);
        System.out.println("--> The entered character is " + (isVowel(ch) ? "Vowel" : "Consonant"));        
    }     
}