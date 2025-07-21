package java;

    import java.util.Scanner;
import java.util.InputMismatchException;

    public class ScientificCalculator1 {

        public static double add(double num1, double num2) {
            return num1 + num2;
        }

        public static double subtract(double num1, double num2) {
            return num1 - num2;
        }

        public static double multiply(double num1, double num2) {
            return num1 * num2;
        }

        public static double divide(double num1, double num2) {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return Double.NaN; // Not a Number
            }
            return num1 / num2;
        }

        public static double calculateSquareRoot(double num) {
            if (num < 0) {
                System.out.println("Error: Cannot calculate square root of a negative number.");
                return Double.NaN;
            }
            return Math.sqrt(num);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean keepRunning = true;

            while (keepRunning) {

                System.out.println("\n==== Scientific Calculator ====");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Square Root");
                System.out.println("6. Exit");
                System.out.print("Choose an option (1-6): ");

                try {
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter first number: ");
                            double a1 = scanner.nextDouble();
                            System.out.print("Enter second number: ");
                            double a2 = scanner.nextDouble();
                            double sum = add(a1, a2);
                            System.out.println("Result: " + sum);
                            break;
                        case 2:
                            System.out.print("Enter first number: ");
                            double s1 = scanner.nextDouble();
                            System.out.print("Enter second number: ");
                            double s2 = scanner.nextDouble();
                            double difference = subtract(s1, s2);
                            System.out.println("Result: " + difference);
                            break;
                        case 3:
                            System.out.print("Enter first number: ");
                            double m1 = scanner.nextDouble();
                            System.out.print("Enter second number: ");
                            double m2 = scanner.nextDouble();
                            double product = multiply(m1, m2);
                            System.out.println("Result: " + product);
                            break;
                        case 4:
                            System.out.print("Enter numerator: ");
                            double d1 = scanner.nextDouble();
                            System.out.print("Enter denominator: ");
                            double d2 = scanner.nextDouble();
                            double quotient = divide(d1, d2);
                            if (!Double.isNaN(quotient)) {
                                System.out.println("Result: " + quotient);
                            }
                            break;
                        case 5:
                            System.out.print("Enter number: ");
                            double n = scanner.nextDouble();
                            double sqrt = calculateSquareRoot(n);
                            if (!Double.isNaN(sqrt)) {
                                System.out.println("Result: " + sqrt);
                            }
                            break;
                        case 6:
                            keepRunning = false;
                            System.out.println("Exiting calculator. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    scanner.nextLine(); // Clear the invalid input
                }
            }

            scanner.close();
        }


}
