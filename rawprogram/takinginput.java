import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your name");
        // String name = sc.nextLine();
        // System.out.println("name is" + name);

        // System.out.println("enter your lucky number");
        // int num_1 = sc.nextInt();
        // System.out.println("your lucky number is" + num_1);ayush
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a frist number");
        int num_1 = sc.nextInt();
        System.out.println("enter a second number");
        int num_2 = sc.nextInt();
        int sum = num_1 + num_2;
        System.out.println("sum is"  + sum);
    }
}
