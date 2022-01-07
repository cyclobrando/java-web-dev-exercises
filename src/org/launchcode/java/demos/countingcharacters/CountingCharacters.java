package org.launchcode.java.demos.countingcharacters;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = paragraph.toLowerCase().toCharArray();

        HashMap<Character, Integer> alphabet = new HashMap<>();

        for (char c : charactersInString){
            if (Character.isLetter(c)){
                if (!alphabet.containsKey(c)){
                    alphabet.put(c, 1);
                } else {
                    int count = alphabet.get(c) + 1;
                    //count ++;
                    alphabet.replace(c, count);
                }
            }
        }
        System.out.println(alphabet);
    }
}

