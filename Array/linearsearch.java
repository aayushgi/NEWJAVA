<<<<<<< HEAD
public class linearsearch {
    
    public static int linearsearch(int number[], int key) {
        for(int i=0; i<number.length; i++){
           if(number[i]==key){
            return i;
           }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int number[]={2, 3, 5, 6, 8, 10, 99};
        int key=5;

        int index = linearsearch(number, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index :  " +index);
        }
    }
}
=======
public class linearsearch {
    
    public static int linearsearch(int number[], int key) {
        for(int i=0; i<number.length; i++){
           if(number[i]==key){
            return i;
           }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int number[]={2, 3, 5, 6, 8, 10, 99};
        int key=5;

        int index = linearsearch(number, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index :  " +index);
        }
    }
}
>>>>>>> 7dad1f3 (first commit)
