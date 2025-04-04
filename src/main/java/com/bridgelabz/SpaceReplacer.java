package com.bridgelabz;

public class SpaceReplacer {
    public static String replaceMultipleSpaces(String text) {
        // Regex to match multiple spaces
        String regex = "\\s+";

        // Replace multiple spaces with a single space
        String result = text.replaceAll(regex, " ");

        return result;
    }

    public static void main(String[] args) {
        String text = "This  is   an  example    with multiple  spaces.";
        String modifiedText = replaceMultipleSpaces(text);

        // Print the modified string
        System.out.println(modifiedText);
    }
}
