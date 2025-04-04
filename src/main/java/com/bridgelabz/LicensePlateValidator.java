import java.util.regex.*;

public class LicensePlateValidator {
    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$"; // Two uppercase letters + four digits

        return Pattern.matches(regex, plate);
    }

    public static void main(String[] args) {
        String[] testPlates = {"AB1234", "A12345", "XY9999", "ab1234", "XYZ123"};

        for (String plate : testPlates) {
            System.out.println(plate + " → " + (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
/*

^ --->	Start of the string
[A-Z]{2} --->	Exactly two uppercase letters (A-Z)
\\d{4} ---->	Exactly four digits (0-9)
$ ---->	End of the string

*/
