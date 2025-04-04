package com.regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordExtractor {
    public static List<String> extractCapitalizedWords(String text) {
        String regex = "\\b[A-Z][a-z]*\\b"; // Word starting with a capital letter, followed by lowercase letters

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> capitalizedWords = new ArrayList<>();
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = extractCapitalizedWords(text);

        // Print all capitalized words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
