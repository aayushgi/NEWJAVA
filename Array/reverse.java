<<<<<<< HEAD
public class reverse {

    public static void reverse(int number[]) {
        int frist=0, last= number.length-1;
        while (frist<last) {
            int temp= number[last];
            number[last]=number[frist];
            number[frist]=temp;
            frist++; 
            last--;
            
        }
        
    }
    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10, 12, 14};
        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]+ " ");
        }
        System.out.println();
    }
}
=======
// public class reverse {

//     public static void reverse(int number[]) {
//         int frist=0, last= number.length-1;
//         while (frist<last) {
//             int temp= number[last];
//             number[last]=number[frist];
//             number[frist]=temp;
//             frist++; 
//             last--;
            
//         }
        
//     }
//     public static void main(String[] args) {
//         int number[]={2, 4, 6, 8, 10, 12, 14};
//         reverse(number);
//         for(int i=0; i<number.length; i++){
//             System.out.println(number[i]+ " ");
//         }
//         System.out.println();
//     }
// }
>>>>>>> 7dad1f3 (first commit)
