import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display original input
        System.out.println("Original String: " + inputString);

        // Convert to uppercase
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        // Convert to lowercase
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);

        // Display the length of the string
        int stringLength = inputString.length();
        System.out.println("Length: " + stringLength);

        // Display the first character of the string
        if (stringLength > 0) {
            char firstChar = inputString.charAt(0);
            System.out.println("First Character: " + firstChar);
        } else {
            System.out.println("String is empty.");
        }

        // Display a substring (from index 1 to the end)
        if (stringLength > 1) {
            String substring = inputString.substring(1);
            System.out.println("Substring from index 1: " + substring);
        } else {
            System.out.println("String is too short for substring.");
        }

        // Close the scanner
        scanner.close();
    }
}
