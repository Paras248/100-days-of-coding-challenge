import java.util.Scanner;

/*
 * Day 31 coding Statement : Write a Program to Toggle each character in a string
*/

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) res.append(Character.toLowerCase(ch));
            else res.append(Character.toUpperCase(ch));
        }
        System.out.println("Toggled String: " + res);
    }    
}
