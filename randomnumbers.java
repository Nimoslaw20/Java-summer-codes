import java.util.Scanner;

public class randomnumbers {
  public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
      
      int secret, guess;
      
      secret = 1 + (int)(100*Math.random());
      
      System.out.println("Guess a number between 1-100");
      System.out.print(">  ");
      guess = input.nextInt();
      
      
      while (secret != guess) {
        if (guess < secret) {
          System.out.println("Try again, your gues is low");
          guess = input.nextInt();
        }
        if (guess > secret) {
          System.out.println("Sorry its too high");
          guess = input.nextInt();
        }
      }
    System.out.println("You guessed it");
    
    input.close();
  }
}