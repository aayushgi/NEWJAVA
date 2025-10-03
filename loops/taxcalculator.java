<<<<<<< HEAD
import java.util.*;
public class taxcalculator{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter your income");
      int income = sc.nextInt();
      int tax;

      if(income<500000){
        tax = 0;
      }
      else if(income<=500000 && income<1000000){
        tax = (int) (income*0.2);
    }
       else{
        tax = (int) (income*0.3);
       }

       System.out.println("total tax to be paid :" +tax);
        }
}
=======
import java.util.*;
public class taxcalculator{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter your income");
      int income = sc.nextInt();
      int tax;

      if(income<500000){
        tax = 0;
      }
      else if(income<=500000 && income<1000000){
        tax = (int) (income*0.2);
    }
       else{
        tax = (int) (income*0.3);
       }

       System.out.println("total tax to be paid :" +tax);
        }
}
>>>>>>> 7dad1f3 (first commit)
