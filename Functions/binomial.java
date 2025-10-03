public class binomial {
    
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bincoffe(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_n_r = fact(n - r);

        int bincoffe = fact_n / (fact_r * fact_n_r);
        return bincoffe;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        // Test binomial coefficient
        System.out.println("Binomial coefficient C(5,2): " + bincoffe(5, 2));
        
        // Test prime checking
        System.out.println("Is 12 prime? " + isPrime(12));
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 2 prime? " + isPrime(2));
    }
}
