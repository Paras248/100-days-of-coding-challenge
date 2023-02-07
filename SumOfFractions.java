
/*
 * Day 18 coding Statement : Write a program to Add two fractions
*/

import java.util.Scanner;

public class SumOfFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator for number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the denominator for number 1: ");
        int den1 = sc.nextInt();

        System.out.print("Enter the numerator for number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the denominator for number 2: ");
        int den2 = sc.nextInt();


        
        int ansNum = (num1 * den2) + (num2 * den1);
        int ansDen = den1 * den2;
        int gcd = 0;

        for(int c=1; c <= ansNum && c <= ansDen; ++c){
            if(ansNum % c==0 && ansDen % c==0){
                gcd = c;
            }
        }

        System.out.println((ansNum / gcd) + " / " + (ansDen / gcd));

        
    }
}
