package com.bridgelabz;

import java.util.*;
import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing an SSN:");
        String input = sc.nextLine();

        List<String> validSSNs = extractValidSSNs(input);

        if (validSSNs.isEmpty()) {
            System.out.println("No valid SSN found.");
        } else {
            for (String ssn : validSSNs) {
                System.out.println("✅ \"" + ssn + "\" is valid");
            }
        }

        sc.close();
    }

    public static List<String> extractValidSSNs(String text) {
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b"; // Matches SSNs in the format XXX-XX-XXXX
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> validSSNs = new ArrayList<>();
        while (matcher.find()) {
            validSSNs.add(matcher.group());
        }
        return validSSNs;
    }
}

