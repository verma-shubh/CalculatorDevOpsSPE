package calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    // Method for calculating square root of a number.
    public double squareRoot(double input) {
//        logger.info("Calculating square root of: " + input + "...");
        double result = Math.sqrt(input);
        logger.info("Calculated square_root of: " + input + "\nResult: " + result);
        return result;
    }

    // Method for calculating factorial of a number.
    public double factorial(double input) {
//        logger.info("Calculating factorial of: " + input + "...");
        if (input < 0) {
            return Double.NaN;
        } else {
            double result = 1;
            for (int i = 1; i <= input; i++) {
                result = result * i;
            }
            logger.info("Calculated factorial of: " + input + "\nResult: " + result);
            return result;
        }
    }

    // Method for calculating natural logarithm of a number.
    public double naturalLogarithm(double input) {
//        logger.info("Calculating natural logarithm of: " + input + "...");
        double result = Math.log(input);
        logger.info("Calculated natural_logarithm of: " + input + "\nResult: " + result);
        return result;
    }

    // Method for calculating power of a given number.
    public double exponentiation(double base, double power) {
//        logger.info("Calculating exponentiation of: " + base + " to the power of " + power + "...");
        double result = Math.pow(base, power);
        logger.info("Calculated exponentiation of: " + base + " to the power of " + power + "\nResult: " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double input1, input2;
        int choice;
        while (true) {
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Select one of the following operations:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Selected Operation: Square Root.");
                    System.out.print("Enter a number: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Square root of " + input1 + " = " + calculator.squareRoot(input1));
                    break;
                case 2:
                    System.out.println("Selected Operation: Factorial.");
                    System.out.print("Enter a number: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Factorial of " + input1 + " = " + calculator.factorial(input1));
                    break;
                case 3:
                    System.out.println("Selected Operation: Natural Logarithm.");
                    System.out.print("Enter a number: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Factorial of " + input1 + " = " + calculator.naturalLogarithm(input1));
                    break;
                case 4:
                    System.out.println("Selected Operation: Exponentiation.");
                    System.out.print("Enter the base: ");
                    input1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    input2 = scanner.nextDouble();
                    System.out.println("Power of " + input1 + " raised to " + input2 + " = " + calculator.exponentiation(input1, input2));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Enter a valid choice.");
            }
            System.out.println();
        }
    }
}
