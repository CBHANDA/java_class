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

    void performOperation() {
        if (choice == 1) {
            add();
        } else if (choice == 2) {
            multiply();
        } else if (choice == 3) {
            subtract();
        } else if (choice == 4) {
            divide();
        } else if (choice == 5) {
            modulus();
        } else if (choice == 6) {
            areaOfCircle();
        } else if (choice == 7) {
            areaOfRectangle();
        } else if (choice == 8) {
            System.out.println("Exiting the program.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    void add() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    void multiply() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    void subtract() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    void divide() {
        System.out.print("Enter dividend: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter divisor: ");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: Division by zero not allowed.");
        } else {
            System.out.println("Result: " + (num1 / num2));
        }
    }

    void modulus() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("Modulus by zero is not allowed.");
        } else {
            System.out.println("Result: " + (num1 % num2));
        }
    }

    void areaOfCircle() {
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void areaOfRectangle() {
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle: " + (length * width));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            calc.displayMenu();
            calc.performOperation();
        } while (calc.choice != 8);
    }
}
