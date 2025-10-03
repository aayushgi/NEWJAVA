<<<<<<< HEAD
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.println("Result: " + (a + b));
                break;
            case '-' :
                System.out.println("Result: " + (a - b));
                break;
            case '*' :
                System.out.println("Result: " + (a * b));
                break;
            case '/' :
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
        }
        scanner.close();
    }
}
=======
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.println("Result: " + (a + b));
                break;
            case '-' :
                System.out.println("Result: " + (a - b));
                break;
            case '*' :
                System.out.println("Result: " + (a * b));
                break;
            case '/' :
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
        }
        scanner.close();
    }
}
>>>>>>> 7dad1f3 (first commit)
