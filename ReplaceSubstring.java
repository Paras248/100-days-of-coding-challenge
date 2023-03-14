/*
 * Day 40 coding Statement : Write a Program to Replace substring in a string  
*/

import java.util.*;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter a string to be removed: ");
        String rem = sc.next();
        System.out.print("Enter new string: ");
        String newStr = sc.next();
        int idx = str.indexOf(rem);
        if(idx == -1){
            System.out.println("String doesn't contain given substring");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(idx, rem.length(), newStr);

        System.out.println("The new string: " + sb);
    }
}
