<<<<<<< HEAD
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. which you want to print");
        int n = sc.nextInt();
        int num = 1;
        
        while (num <= n) {
            System.out.println(num);
            num++; // increment operator
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
=======
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. which you want to print");
        int n = sc.nextInt();
        int num = 1;
        
        while (num <= n) {
            System.out.println(num);
            num++; // increment operator
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
>>>>>>> 7dad1f3 (first commit)
