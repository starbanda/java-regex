import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static List<String> extractEmails(String text) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"; // Email pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return  emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for more details.";
        List<String> emails = extractEmails(text);

        for (String email : emails) {
            System.out.println(email);
        }
    }
}
