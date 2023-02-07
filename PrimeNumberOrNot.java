/*
 *  Day 20 coding Statement : Write a program to identify if the number is Prime number or not 
*/

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num < 2){
            System.out.println("--> Not a prime number");
        } else {
            for(int i = 2; i <= num / 2; i++){
                if(num % i == 0){
                    isPrime = false;
                }
            } 
            if(isPrime){
                System.out.println("--> Number is prime.");
            } else {
                System.out.println("--> Number is not prime.");          
            }
        }
    }
}
