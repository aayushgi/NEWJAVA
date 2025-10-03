<<<<<<< HEAD

    import java.util.*;
public class maxsubarrays {

    public static void maxsubarraySum(int number[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            int start=i;
            for(int j=i; j<number.length; j++){
                int end =j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    //subarray sum
                    currSum+=number[k];
                }
            }
            System.out.println(currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
            

        }
        
      System.out.println("max sum = " +maxSum);  
    }
    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10};
        maxsubarraySum(number);
    }
}


=======

    import java.util.*;
public class maxsubarrays {

    public static void maxsubarraySum(int number[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            int start=i;
            for(int j=i; j<number.length; j++){
                int end =j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    //subarray sum
                    currSum+=number[k];
                }
            }
            System.out.println(currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
            

        }
        
      System.out.println("max sum = " +maxSum);  
    }
    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10};
        maxsubarraySum(number);
    }
}


>>>>>>> 7dad1f3 (first commit)
