<<<<<<< HEAD
//using p
    
    
    import java.util.*;
public class maxsubarrays2 {

    public static void maxsubarraySum(int number[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[number.length];

 prefix[0]= number[0];


        
            

            //claculate prefix array
            for(int i=1; i<prefix.length;i++){
                prefix[i]=prefix[i-1]+number[i];
            }
            for(int i=0; i<number.length; i++){
                int start=i;
            
            for(int j=i; j<number.length; j++){
                int end =j;
                currSum= start==0? prefix[end] :prefix[end] - prefix[start-1];
           //     for(int k=start; k<=end; k++){
                    //subarray sum
          //          currSum+=number[k];
            //    }
         //   }
            
            if(maxSum<currSum){
                maxSum=currSum;
            }
            

        }
        
      System.out.println("Max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10};
        maxsubarraySum(number);
    }
}



=======
// //using p
    
    
//     import java.util.*;
// public class maxsubarrays2 {

//     public static void maxsubarraySum(int number[]) {
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]= new int[number.length];

//  prefix[0]= number[0];


        
            

//             //claculate prefix array
//             for(int i=1; i<prefix.length;i++){
//                 prefix[i]=prefix[i-1]+number[i];
//             }
//             for(int i=0; i<number.length; i++){
//                 int start=i;
            
//             for(int j=i; j<number.length; j++){
//                 int end =j;
//                 currSum= start==0? prefix[end] :prefix[end] - prefix[start-1];
//            //     for(int k=start; k<=end; k++){
//                     //subarray sum
//           //          currSum+=number[k];
//             //    }
//          //   }
            
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
            

//         }
        
//       System.out.println("Max sum = " + maxSum);
//     }
//     public static void main(String[] args) {
//         int number[]={2, 4, 6, 8, 10};
//         maxsubarraySum(number);
//     }
// }



>>>>>>> 7dad1f3 (first commit)
