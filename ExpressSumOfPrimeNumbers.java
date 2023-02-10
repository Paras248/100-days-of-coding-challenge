/*
 * Day 22 coding Statement : Write a program to express a number as a sum of two prime numbers
*/
import java.util.Scanner;

public class ExpressSumOfPrimeNumbers {
    private static boolean checkIsPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2, j = num - 2;
        boolean isExpressed = false;
        while(i <= j){
            if(i + j == num){
                if(checkIsPrime(i) && checkIsPrime(j)){
                    isExpressed = true;
                    System.out.println("Number can be expressed as " + i + " & " + j);
                    break;
                }
                i++;
                j--;
            }
        }
        if(isExpressed == false){
            System.out.println("Number cannot be expressed");
        }
    }  
}

