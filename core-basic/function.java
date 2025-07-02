public class function {
   // Check given number in prime or not
   public static boolean isPrime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;

   }

   public static void main(String[] args) {
       // Test the isPrime function
       int number = 29; // Example number
       if(isPrime(number)){
           System.out.println(number + " is a prime number.");
       } else {
           System.out.println(number + " is not a prime number.");
       }
   }


    
}