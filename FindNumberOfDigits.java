/*
 * Day 9 coding Statement : Write a program to find Number of digits in an integer 
*/

import java.util.Scanner;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("* Enter the number: ");
        int num = sc.nextInt();

        int numberOfDigits = 0;
        
        while(num != 0){
            num = num / 10;
            numberOfDigits++;
        }

        System.out.println("--> Number of Digits: " + numberOfDigits);
    }
}
