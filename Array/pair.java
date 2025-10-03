<<<<<<< HEAD
public class pair {

    public static void printPairs(int number[]) {
        int tp=0;
        for(int i=0; i<number.length; i++){
            int curr= number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.println("("+ curr+ "," +number[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" +tp);
        
    }

    public static void main(String[] args) {
        int number[]={2, 4, 6 , 8, 10};
        printPairs(number);
    }
}
//total pairs
// =n(n-1)/2
=======
public class pair {

    public static void printPairs(int number[]) {
        int tp=0;
        for(int i=0; i<number.length; i++){
            int curr= number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.println("("+ curr+ "," +number[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" +tp);
        
    }

    public static void main(String[] args) {
        int number[]={2, 4, 6 , 8, 10};
        printPairs(number);
    }
}
//total pairs
// =n(n-1)/2
>>>>>>> 7dad1f3 (first commit)
//time complexity n square