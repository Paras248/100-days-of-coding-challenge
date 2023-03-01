/*
 * Day 33 coding Statement : Write a Program to check if String is a palindrome or not  
*/

import java.util.Scanner;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int i = 0, j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("String is not palindrome");
                return;
            }
            i++; j--;
        }

        System.out.println("String is palindrome");
    }
}
