/*
 * Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression  
*/

import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']') continue; 
            res.append(ch);
        }

        System.out.println("String with removed Brackets: " + res);
    }
}
