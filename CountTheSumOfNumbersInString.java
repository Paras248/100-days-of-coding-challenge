import java.util.Scanner;

/*
 * Day 35 coding Statement : Write a Program to Count the sum of numbers in a string 
*/

import java.util.Scanner;

public class CountTheSumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the string: ");
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum: " + sum);
    }    
}
