import java.util.Scanner;

public class Morenumber {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int current, total = 0;
    
    System.out.println("Type any number and I will add up : ");
    
    do {
      System.out.print("Value: ");
      current = input.nextInt();
      total += current;
      System.out.println("The total so far is " + total);
    }
    while (current !=0);
    
    System.out.println("The final total is  " + total);
    input.close();
  }
}

        
      
    
      
     
                    