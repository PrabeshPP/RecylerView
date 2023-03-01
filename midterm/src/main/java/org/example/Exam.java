package org.example;

public class Exam {
    public static void main(String[] args) {
        for (String word : args) {
            String leetWord = makeLeet(word);
            System.out.println(word + ": " + leetWord);
        }
    }
    public static String makeLeet(String input) {
        String output = input.replace('A', '4'); // A becomes four
        output = input.replace('E', '3'); // E becomes three
        return output;
    }
}