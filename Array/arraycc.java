<<<<<<< HEAD
import java.util.*;

public class arraycc {
    public static void main(String[] args) {
        
        int marks[]= new int[50]; 

        Scanner sc= new Scanner(System.in);
        marks[0]= sc.nextInt();//phy
    
        marks[1]= sc.nextInt();//che
        marks[2]= sc.nextInt();//mat

        System.out.println("phy" + marks[0]);
        System.out.println("che" + marks[1]);
        System.out.println("mat" + marks[2]);

        //how to update
        marks[2] = 88;
        System.out.println("mat" +marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : " +percentage);
    }
}
        
        
=======
import java.util.*;

public class arraycc {
    public static void main(String[] args) {
        
        int marks[]= new int[50]; 

        Scanner sc= new Scanner(System.in);
        marks[0]= sc.nextInt();//phy
    
        marks[1]= sc.nextInt();//che
        marks[2]= sc.nextInt();//mat

        System.out.println("phy" + marks[0]);
        System.out.println("che" + marks[1]);
        System.out.println("mat" + marks[2]);

        //how to update
        marks[2] = 88;
        System.out.println("mat" +marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : " +percentage);
    }
}
        
        
>>>>>>> 7dad1f3 (first commit)
