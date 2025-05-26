import java.util.Scanner;

public class Calculator {
    int choice;
    Scanner sc = new Scanner(System.in);

    void displayMenu() {
        System.out.println("\nCalculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Area of Circle");
        System.out.println("7. Area of Rectangle");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
    }

    void Operation() {
        double num1, num2;

        if (choice == 1) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            System.out.println("Result: " + (num1 + num2));

        } else if (choice == 2) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            System.out.println("Result: " + (num1 * num2));

        } else if (choice == 3) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            System.out.println("Result: " + (num1 - num2));

        } else if (choice == 4) {
            System.out.print("Enter dividend: ");
            num1 = sc.nextDouble();
            System.out.print("Enter divisor: ");
            num2 = sc.nextDouble();
            if (num2 == 0) {
                System.out.println("Error: Division by zero not allowed.");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }

        } else if (choice == 5) {
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            if (num2 == 0) {
                System.out.println("Modulus by zero is not allowed.");
            } else {
                System.out.println("Result: " + (num1 % num2));
            }

        } else if (choice == 6) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            System.out.println("Area of Circle: " + (Math.PI * radius * radius));

        } else if (choice == 7) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            System.out.println("Area of Rectangle: " + (length * width));

        } else if (choice == 8) {
            System.out.println("Exiting the program.");

        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            calc.displayMenu();
            calc.Operation();
        } while (calc.choice != 8);
    }
}
