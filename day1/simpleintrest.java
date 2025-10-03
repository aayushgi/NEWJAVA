import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount");
        float p = sc.nextFloat();
        System.out.println("enter the rate of intrest");
        float r = sc.nextFloat();
        System.out.println("enter time");
        float t = sc.nextFloat();
        
        float si = (p * r *t)/100;
        System.out.println("principal is " +p);
        System.out.println("intrest is" +r);
        System.out.println("time is" +t);
        System.out.println("simple intrest is" +si);

        }
    
}
