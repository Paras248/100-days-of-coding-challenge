/*
 * Day 15 coding Statement : Write a program to identify if the number is Strong number or not
*/

import java.util.Scanner;

public class NumberStrongOrNot {
    private static int calculateFactorial(int num){
        int factorial = 1;
        for(int i = num; i >= 1; i--){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += calculateFactorial(rem);
            num /= 10;
        }

        if(sum == temp){
            System.out.println("--> Number is strong");
        } else {
            System.out.println("--> Number is not strong");
        }
    }
}
