/*
 * Day 32 coding Statement : Write a Program to Remove vowels from a string 
*/

import java.util.Scanner;

public class RemoveVowel {
    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!isVowel(ch)) res.append(ch);
        }

        System.out.println("String with removed Vowel: " + res);
    }
}
