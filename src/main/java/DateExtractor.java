import java.util.regex.*;
import java.util.*;

public class DateExtractor {
    public static List<String> extractDates(String text) {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b"; // Matches date in dd/mm/yyyy format

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> extractedDates = extractDates(text);

        // Print all extracted dates
        for (String date : extractedDates) {
            System.out.println(date);
        }
    }
}
