import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Example 1: Square Root
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);

        // Example 2: Power
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);


        // Example 3: Random Number
        double random = Math.random(); // Generates a random double value between 0 (inclusive) and 1 (exclusive)
        System.out.println("Random number between 0 and 1: " + random);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
