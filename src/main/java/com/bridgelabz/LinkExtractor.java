import java.util.regex.*;
import java.util.*;

public class LinkExtractor {
    public static List<String> extractLinks(String text) {
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+(?:/[a-zA-Z0-9&%_.-~-]*)*\\b"; // URL pattern for http:// and https://

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> extractedLinks = extractLinks(text);

        // Print all extracted links
        for (String link : extractedLinks) {
            System.out.println(link);
        }
    }
}

/*

\\b ---->	Word boundary (ensures we match whole URLs)
https?:// ----->	Matches http:// or https:// (the s? means the s is optional)
[a-zA-Z0-9.-]+  ----->	Matches the domain part, allowing letters, numbers, dots, and hyphens
(?: ... )	------> Non-capturing group for the optional path (URL path, query parameters, etc.)
/[a-zA-Z0-9&%_.-~-]*  ----->	Matches optional URL path starting with /, followed by allowed characters
*	----> Allows for zero or more path segments (e.g., /page1, /info?id=1)
\\b	-----> Word boundary (ensures we stop at the end of the URL)

*/