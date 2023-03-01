/*
 * Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function  
*/

import java.util.Scanner;

public class GetStringLengthWithoutInbuiltMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int len = 0;
        for(char c: str.toCharArray()){
            len++;
        }
        System.out.println("Length: " + len);
    }
}
