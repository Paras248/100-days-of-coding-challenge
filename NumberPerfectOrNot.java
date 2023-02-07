/*
 * Day 16 coding Statement : Write a program to identify if the number is Perfect number or not
*/

import java.util.Scanner;

public class NumberPerfectOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("--> Number is perfect");
        } else {
            System.out.println("--> Number is not perfect");
        }
    }
}
