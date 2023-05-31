
import java.util.Scanner;

// Define the Calculator interface
interface Calculator {
    double calculate(double num1, double num2);
}

// Implementation of the Calculator interface for addition
class Addition implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

// Implementation of the Calculator interface for subtraction
class Subtraction implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

// Implementation of the Calculator interface for multiplication
class Multiplication implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

// Implementation of the Calculator interface for division
class Division implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
    }
}

// Main class to run the calculator


