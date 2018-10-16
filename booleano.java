import java.util.Scanner;

public class booleano {
  public static void main( String[] args){
    
    Scanner input = new Scanner(System.in);
    
    String  word;
    boolean yep, nope;
    
    System.out.println("Type a word below");
    word = input.next();
    
    yep = word.equals("house");
    nope = ! word.equals("house");
    
    System.out.println("You typed what: " + yep);
    System.out.println("You ignored: " + nope);
    
    input.close();
    
  }
}