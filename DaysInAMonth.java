/*
 * Day 7 coding Statement: Write a program to find Number of days in a given month of a given year 
*/

import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("* Enter the month number: ");
        int month = sc.nextInt();
        System.out.print("* Enter the year: ");
        int year = sc.nextInt();
        
        int days;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                days = 31;
                break;
            }
            case 2: {
                if(year % 400 == 0){
                    days = 29;
                } else if(year % 100 == 0){
                    days = 28;
                } else if(year % 4 == 0){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            }
            default: { 
                if(month >= 1 && month <= 12){
                    days = 30;
                } else {
                    System.out.println("Invalid month!!!");
                    return;
                }
            }
        }
        System.out.println("--> Number of days are " + days);
    }
}
