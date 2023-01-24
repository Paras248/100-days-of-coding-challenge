/*
 * Day 8 coding Statement:  Write a program to find roots of a quadratic equation 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class FindRootsOfQuadraticEquation {
    private static DecimalFormat value = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("* Enter co-efficient a: ");
        int a = sc.nextInt();
        System.out.print("* Enter co-efficient b: ");
        int b = sc.nextInt();
        System.out.print("* Enter co-efficient c: ");
        int c = sc.nextInt();

        // calculating root values
        double root1 = (-b + Math.sqrt( (b * b) - (4 * a * c) )) / 2 * a;
        double root2 = (-b - Math.sqrt( (b * b) - (4 * a * c) )) / 2 * a;
        
        System.out.println("--> Root 1 = " + value.format(root1));
        System.out.println("--> Root 2 = " + value.format(root2));
    }
}
