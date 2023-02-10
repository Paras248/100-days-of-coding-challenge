/*
 * Day 21 coding Statement : Write a program to identify if the number is Palindrome or not 
*/

import java.util.Scanner;
public class NumberPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num, revNum = 0;
        
        while(temp != 0){
            revNum = (revNum * 10) + (temp % 10);
            temp /= 10;
        }

        if(num == revNum){
            System.out.println("--> Number is palindrome");
        } else {
            System.out.println("--> Number is not palindrome");
        }
    }    
}
