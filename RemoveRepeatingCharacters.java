/*
 * Day 38 coding Statement : Write a Program to print Non-repeating characters in a string  
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>();
        System.out.print("Enter the string: ");
        String str = sc.next();
        ArrayList<Character> arr = new ArrayList<>();
       
        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(hs.contains(ch)){ 
                arr.remove(ch);
            } else {
                hs.add(ch);
                arr.add(ch);
            }
        }
        str = "";
        for(int i = 0; i < arr.size(); i++){
            str += arr.get(i);
        }
        System.out.println("Output: " + str);
    }
}
