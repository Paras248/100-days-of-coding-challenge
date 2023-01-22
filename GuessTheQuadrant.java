/*
 * Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie
*/

import java.util.Scanner;

public class GuessTheQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x co-ordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y co-ordinate: ");
        int y = sc.nextInt();

        if(x > 0 && y > 0) {
            System.out.println("The point lies in 1st quadrant");
        } else if(x < 0 && y > 0){
            System.out.println("The point lies in 2nd quadrant");
        } else if(x < 0 && y < 0){
            System.out.println("The point lies in 3rd quadrant");        
        } else if(x > 0 && y < 0){
            System.out.println("The point lies in 4th quadrant");
        } else if(x == 0 && y == 0){
            System.out.println("The point lies at origin");            
        } else if(x == 0 && (y > 0 || y < 0)){
            System.out.println("The point lies on y axis");
        } else {
            System.out.println("The point lies on x axis");
        }
    }
}
