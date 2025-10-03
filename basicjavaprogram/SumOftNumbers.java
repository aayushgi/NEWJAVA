
import java.util.Scanner;

public class SumOftNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the marks obtained in maths: ");
        int maths = scanner.nextInt();

        System.out.print("Enter the marks obtained in java: ");
        int java = scanner.nextInt();
        System.out.print("enter  the marks obtained in elecrical: ");
        int elecrical = scanner.nextInt();
        System.out.print("enter marks obatined in c++: ");
        int c = scanner.nextInt();
        System.out.print("enter marks obtained in python: ");
        int python = scanner.nextInt();        
        int sum = maths + java + elecrical + c++ + python;

      
        System.out.println(" Total marks obtained " + maths + java  + elecrical + c++ + python  +sum);

        scanner.close();
    }
}