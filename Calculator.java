import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Basic Calculator!");

        while (continueCalculation) {
            // Prompt the user to choose an operation
            System.out.println("Choose an operation (+, -, *, /, or type 'exit' to quit):");
            String operation = scanner.nextLine();

            // Check if the user wants to exit
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator. Goodbye!");
                continueCalculation = false;
                continue;
            }

            // Prompt the user for two numbers
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            scanner.nextLine(); // Clear the input buffer

            // Perform the chosen operation
            switch (operation) {
                case "+":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "-":
