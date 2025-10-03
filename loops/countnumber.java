<<<<<<< HEAD
import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =  sc.nextInt();
        int numberofdigits = 0;
        while(n>0){
            n=n/10;
            numberofdigits++;
        }
        System.out.println("number of digits in the number is "+numberofdigits);
    }
}
=======
import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =  sc.nextInt();
        int numberofdigits = 0;
        while(n>0){
            n=n/10;
            numberofdigits++;
        }
        System.out.println("number of digits in the number is "+numberofdigits);
    }
}
>>>>>>> 7dad1f3 (first commit)
