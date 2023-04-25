/*
 * Day 47 coding Statement : Write Program to find longest palindrome in an array
*/


import java.util.Scanner;

public class LongestPalindromeInArray {
    private static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        String[] arr = new String[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextLine();
        }

        int maxLen = 0;
        String maxPalindrome = "";
        for(int i = 0; i < size; i++){
            if(isPalindrome(arr[i]) && arr[i].length() > maxLen){
                maxLen = arr[i].length();
                maxPalindrome = arr[i];
            }
        }
        
        System.out.println("Max Palindrome " + maxPalindrome);
    }
}
