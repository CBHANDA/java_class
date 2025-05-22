import java.util.Scanner;

class SciCalc2 {

    private static void Menu() {
        System.out.println("\nCalculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Area of a Circle");
        System.out.println("7. Area of Rectangle");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void Addition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    private static void Multiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    private static void Subtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    private static void Division(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error! Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (dividend / divisor));
        }
    }

    private static void Modulus(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error! Modulus by zero is not allowed.");
        } else {
            System.out.println("Result: " + (num1 % num2));
        }
    }

    private static void CircleArea(Scanner scanner) {
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    private static void RectangleArea(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            Menu();
            choice = scanner.nextInt();

            if (choice == 1) {
                Addition(scanner);
            } else if (choice == 2) {
                Multiplication(scanner);
            } else if (choice == 3) {
                Subtraction(scanner);
            } else if (choice == 4) {
                Division(scanner);
            } else if (choice == 5) {
                Modulus(scanner);
            } else if (choice == 6) {
                CircleArea(scanner);
            } else if (choice == 7) {
                RectangleArea(scanner);
            } else if (choice == 8) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
