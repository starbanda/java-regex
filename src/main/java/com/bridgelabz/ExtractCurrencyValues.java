package com.bridgelabz;

import java.util.*;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing currency values:");
        String input = sc.nextLine();

        List<String> currencyValues = extractCurrencyValues(input);

        if (currencyValues.isEmpty()) {
            System.out.println("No currency values found.");
        } else {
            System.out.println("Extracted currency values: " + currencyValues);
        }

        sc.close();
    }

    public static List<String> extractCurrencyValues(String text) {
        String regex = "\\$?\\b\\d+\\.\\d{2}\\b"; // Matches $45.99 or 10.50
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> values = new ArrayList<>();
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }
}

