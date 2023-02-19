/*
* Day 24 coding Statement : Write a program to print Pyramid pattern using stars
*/

import java.util.Scanner;

public class PatternOnePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number or rows: ");
        int rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows - 1 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}