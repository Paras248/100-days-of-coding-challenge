/*
 * Day 41 coding Statement : Check if two strings match where one string contains wildcard characters  
*/

import java.util.Scanner;

public class CompareWildCardString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        
        if(str1.length() != str2.length()) {
            System.out.println("Strings don't match");
            return;
        }

        for(int i = 0; i < str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(ch1 == '*' || ch1 == '?') continue;
            if(ch1 != ch2){
                System.out.println("Strings don't match");
                return;
            }
        }
        System.out.println("Yes they match");
    }
}
