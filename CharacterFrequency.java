/*
 * Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string 
 */

import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hm = new HashMap<>();
        System.out.print("Enter the String: ");
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)) {
                int occ = hm.get(ch);
                hm.replace(ch, ++occ);
            } else {
                hm.put(ch, 1);
            }
        }

        for(Map.Entry<Character,Integer> ele: hm.entrySet()){
            System.out.println("The frequency of " + ele.getKey() + " is " + ele.getValue());
        }
    }
}
