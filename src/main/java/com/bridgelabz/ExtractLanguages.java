package com.bridgelabz;

import java.util.*;
import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing programming languages:");
        String input = sc.nextLine();

        List<String> languages = extractProgrammingLanguages(input);

        if (languages.isEmpty()) {
            System.out.println("No programming languages found.");
        } else {
            System.out.println("Extracted programming languages: " + languages);
        }

        sc.close();
    }

    public static List<String> extractProgrammingLanguages(String text) {
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|C|Swift|Kotlin|PHP|Ruby|R|TypeScript|Rust|Perl|Dart|Scala)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
}