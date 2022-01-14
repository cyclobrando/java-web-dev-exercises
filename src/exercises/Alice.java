package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] arg){
    String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
            "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
            "'without pictures or conversation?'";

    String toLowerCaseSentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your search term?");
        String term = input.nextLine().toLowerCase();
        String newSentence = sentence.substring(0, sentence.indexOf(term)).concat(sentence.substring(sentence.indexOf(term) +term.length()));

        if (toLowerCaseSentence.contains(term)){
            System.out.println("Your search term '" + term + "' is located at index " + sentence.indexOf(term) +
                    " and has a length of " + term.length());
            System.out.print(newSentence);
        } else System.out.println("false");
    }
}


