<<<<<<< HEAD
import java.util.Scanner;

public class sumofdigitofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigit=0;
        int original_n = n;

        while (n>10) {
            sumofdigit += n%10;
            n=n/10;
            
        }
        System.out.println("sum of digit of number" +original_n+ "=" +sumofdigit);
    }
}
=======
import java.util.Scanner;

public class sumofdigitofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigit=0;
        int original_n = n;

        while (n>10) {
            sumofdigit += n%10;
            n=n/10;
            
        }
        System.out.println("sum of digit of number" +original_n+ "=" +sumofdigit);
    }
}
>>>>>>> 7dad1f3 (first commit)
