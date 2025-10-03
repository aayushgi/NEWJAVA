public class charactorprint {
    public static void main(String[] args) {
        char ch='A';
        int n= 4;
        for(int line=1; line<=n; line++){
            for(int chrs=1; chrs<=line; chrs++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
