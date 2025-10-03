import java.util.Scanner;

public class parameter {
    public static void printHellowWord() {

        System.out.println("hellow word");
        System.out.println("hellow word");
        System.out.println("hellow word");
        
    }

    public static int calculateSum(int num1, int num2) {//parameter or formal parameter
        int sum= num1 +num2;
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=calculateSum(a, b);//argunements or actual parameter

        System.out.println("sum is:" +sum);
    }
}
