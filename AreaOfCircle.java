/*
 *  Day 25 coding Statement : Write a program to find Area of a circle  
*/
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        System.out.println("Area of circle: " + (Math.PI * (radius * radius)));
    }
}