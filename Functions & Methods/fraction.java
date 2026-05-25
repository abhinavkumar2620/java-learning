import java.util.Scanner;
// This program calculates the factorial of a given number using a method called fraction.
public static int fraction(int a){
  for(int i=a; i>=1; i--){
    a = a * i;
    System.out.println(i);
  }
  return a; // Placeholder return, replace with actual fraction calculation
}

  public static void main(String[]args){
    
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE NUMBER:");
int a = sc.nextInt();
int result = fraction(a);
System.out.println("THE FRACTION OF " + a + " IS: " + result);

  }



