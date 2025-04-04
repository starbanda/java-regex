import java.util.regex.*;

public class CreditCardValidator {
    public static boolean isValidCreditCard(String cardNumber) {
        // Regex pattern to validate Visa or MasterCard (16 digits, starting with 4 or 5)
        String regex = "^(4\\d{15}|5\\d{15})$"; // Visa or MasterCard

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the input string with the regex
        Matcher matcher = pattern.matcher(cardNumber);

        // Return true if it matches, false otherwise
        return matcher.matches();
    }

    public static void main(String[] args) {
        String cardNumber = "4111111111111111";  // Sample Visa card number
        boolean isValid = isValidCreditCard(cardNumber);

        // Print whether the card number is valid or not
        System.out.println("Credit Card Number " + cardNumber + " is valid: " + isValid);
    }
}

