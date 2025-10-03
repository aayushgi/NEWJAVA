<<<<<<< HEAD
//Reverse the digit of a number//
//formula used: ans= ans*10+n%10
//n/=10

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number want to be reversed");
        int n  = sc.nextInt();
        
        int ans=0;
        while(n>0){
            ans= ans*10+n%10;
            n/=10;

        }
        System.out.println("the reverse of the number is "+ans);
    }
}
=======
//Reverse the digit of a number//
//formula used: ans= ans*10+n%10
//n/=10

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number want to be reversed");
        int n  = sc.nextInt();
        
        int ans=0;
        while(n>0){
            ans= ans*10+n%10;
            n/=10;

        }
        System.out.println("the reverse of the number is "+ans);
    }
}
>>>>>>> 7dad1f3 (first commit)
