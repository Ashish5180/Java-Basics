public class recursionFunction{

    // public static int factorial(int n){
    //     if(n== 0 || n == 1) {
    //         return 1;
    //     } else {
    //         return n * factorial(n - 1);
    //     }
    // }

    public static int fibonnaci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }


    public static void main(String[] args) {
        int n = 10; 
        
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonnaci(i) + " ");
        }
    }
}