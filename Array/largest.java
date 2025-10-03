<<<<<<< HEAD
import java.util.*;
public class largest {

    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest= number[i];
            }
        }
        return largest;
    }
  public static void main(String[] args) {
    int number[]={2, 6, 15, 20,35};
    System.out.println("largest number is : " + getlargest(number));
  }  
}
=======
import java.util.*;
public class largest {

    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest= number[i];
            }
        }
        return largest;
    }
  public static void main(String[] args) {
    int number[]={2, 6, 15, 20,35,78, 99, 10000,};
    System.out.println("largest number is : " + getlargest(number));
  }  
}
>>>>>>> 7dad1f3 (first commit)
