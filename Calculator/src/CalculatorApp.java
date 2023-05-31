import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // Create instances of the calculator operations
        Calculator add = new Addition();
        Calculator subtract = new Subtraction();
        Calculator multiply = new Multiplication();
        Calculator divide = new Division();

        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the calculations
        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + subtract.calculate(num1, num2));
        System.out.println("Multiplication: " + multiply.calculate(num1, num2));
        
        try {
            System.out.println("Division: " + divide.calculate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}