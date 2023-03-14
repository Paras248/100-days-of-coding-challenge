/*
 * Day 39 coding Statement : Write a Program to check if two strings are Anagram or not  
*/

import java.util.*;

public class StringAnagramOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(ch1.length != ch2.length){
            System.out.println("Not an anagram string");
            return;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i < ch1.length; i++){
            if(ch1[i] != ch2[i]){
                System.out.println("Not an anagram string");
                return;
            }
        }
        System.out.println("String is anagram");
    }
}
