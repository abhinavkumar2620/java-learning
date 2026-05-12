public class StarByLoop {
  // This program prints a right-angled triangle of stars using nested loops
public static void main(String[] args) {
  for(int line = 1; line <=4; line++)
        {
            for (int star = 1; star <=line;star++){
            System.out.print("*");
            }
            
            System.out.println("");
        }
}
  
}