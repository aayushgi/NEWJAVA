
    import java.util.Scanner;

public class SumOfthreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("enter the third number");
        int num3 = scanner.nextInt();
        
        int sum = num1 + num2 + num3;

      
        System.out.println("The sum of " + num1 + " , " + num2 + " a" + num3 + " is "  + sum);

        scanner.close();
    }
}


