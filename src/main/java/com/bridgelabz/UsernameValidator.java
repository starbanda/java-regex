import java.util.regex.*;
public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return  Pattern.matches(regex, username);
    }

    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "us", "Valid_User", "user12345"};
        for(String username: testUsernames){
            System.out.println(username + " → " + (isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }
}

/*

^ --->	Start of the string
[a-zA-Z] ---->	First character must be a letter
[a-zA-Z0-9_] ----->	Can contain letters, numbers, and underscores
{4,14} ----> Length constraint (total length: 5 to 15 characters)
$ ---> End of the string

*/