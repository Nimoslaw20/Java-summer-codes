import java.util.Scanner;
 
 public class getinput {
   public static void main( String[] args ) {
     
     String country;
     int number; 
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println( "What city is the capital of France?" );
     country =keyboard.next();
     
     System.out.println( "What is 6 multiplied by 7?" );
     number = keyboard.nextInt();
     
     System.out.println("So you come from" +  " " +  country + " " + "and you like number " + " " + number);

     keyboard.close();
  }
}
      
 