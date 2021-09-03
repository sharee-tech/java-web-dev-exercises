package exercises;
import java.util.Locale;
import java.util.Scanner;


public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        System.out.println(sentence);
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word in the first sentence from 'Alice in Wonderland':");
        String word = input.nextLine();
        System.out.println(sentence.toLowerCase().contains(word.toLowerCase()));
        Integer index = sentence.indexOf(word);
        System.out.println(index);
        Integer length = word.length();
        System.out.println(length);
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String newSentence = sentence.replace(word, "");
        System.out.println(newSentence);
    }
}



