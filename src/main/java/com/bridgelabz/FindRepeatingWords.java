import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        Set<String> repeatingWords = findRepeatingWords(input);

        if (repeatingWords.isEmpty()) {
            System.out.println("No repeating words found.");
        } else {
            System.out.println("Repeating words: " + repeatingWords);
        }

        sc.close();
    }

    public static Set<String> findRepeatingWords(String text) {
        String regex = "\\b(\\w+)\\b"; // Matches individual words
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> wordCount = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group().toLowerCase(); // Convert to lowercase for case insensitivity
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        Set<String> repeatingWords = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }
        return repeatingWords;
    }
}

