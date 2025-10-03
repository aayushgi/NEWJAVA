import java.util.Scanner;

public class agegroup {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // if (age <= 12) {
        //     System.out.println("child");
        // } else if (age > 12 && age <= 18) {
        //     System.out.println("teenager");
        // } else {
        //     System.out.println("adult");
        // }
          
        String ans;
        ans = (num % 2 == 0)? "even" : "odd";
        System.out.println(ans);        
    }
}
