/*
 * Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not 
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int num = sc.nextInt();
        String numStr = String.valueOf(num);
        int sum = 0;
        int len = numStr.length();
        
        for(int i = 0; i < len; i++){
            sum += Math.pow((num % 10), len);
            num /= 10;
        }
        if(sum == Integer.parseInt(numStr)){
            System.out.println("--> Number is Armstrong");
        } else {
            System.out.println("--> Not a Armstrong number");
        }
    }    
}
