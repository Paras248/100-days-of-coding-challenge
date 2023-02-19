/*
 * Day 26 coding Statement : Write a program to calculate Maximum number of handshakes  
*/

import java.util.Scanner;

public class MaximumNumberOfHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int num = sc.nextInt();
        --num;
        System.out.println("Number of Handshakes: " + ((num * (num + 1)) / 2));
    }    
}
