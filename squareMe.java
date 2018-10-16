import java.util.Scanner;

public class squareMe {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    double receive, y ;
    
    System.out.println("Enter a number, No negatives, please!!");
    receive = input.nextDouble();
    
    while (receive < 0) {
      System.out.println("Enter a positive number");
      receive = input.nextDouble();
    }
    
    y = Math.sqrt(receive);
    
    System.out.println("The square root for " + receive + " is " + y);
    
    input.close();
  }
}
        