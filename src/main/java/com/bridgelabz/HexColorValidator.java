package com.bridgelabz;

import java.util.regex.*;

public class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        String regex = "^#([A-Fa-f0-9]{6})$"; // Starts with #, followed by 6 hex characters

        return Pattern.matches(regex, color);
    }

    public static void main(String[] args) {
        String[] testColors = {"#FFA500", "#ff4500", "#123", "#abcdef", "#GHIJKL"};

        for (String color : testColors) {
            System.out.println(color + " → " + (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}

/*

^	---> Start of the string
#  ---->	Must start with #
[A-Fa-f0-9]{6} ----> Exactly six characters, only 0-9, A-F, or a-f
$  ---->	End of the string

*/