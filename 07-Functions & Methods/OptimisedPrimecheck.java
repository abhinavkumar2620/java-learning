//this program checks if a number is prime or not using an optimised method that checks for factors only up to the square root of the number.
public class OptimisedPrimecheck {
  public static boolean isprime(int n){
  for(int i = 2; i<=Math.sqrt(n); i++){
    if (n%i==0){
      return false;
    }
  }
  return true;
  }
  public static void main(String[]args){
  int n=11;
  System.out.println(isprime(n));
  }
}
