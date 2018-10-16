import java.util.Scanner;
import java.util.Date;


public class transport{
  public static void main( String[] args) {
  
    String nameA, nameB, destination;
    double ticketprice;
    Date d1;
    
    d1 = new Date();
      
    Scanner input = new Scanner(System.in);
    
    System.out.println("***************************************************");
    System.out.println("|        Welcome to the Online Ticket Center             ");
    
    
    System.out.println("Enter your firstname below");
    nameA = input.next();
    
    System.out.println("Enter your surname below");
    nameB = input.next();
    
    System.out.println("Enter Destination below");
    destination = input.next();
      
     System.out.println("The following are the tickets available: Kumas<>Accra - GHC 50.00, Kumasi <> Sunyani - GHC 30.00");
    ticketprice =input.nextDouble();
     
    System.out.println("On " + " " + d1 + " " +nameA + " " +nameB+ " will be traveling from Kumasi to" + " " + destination);
    System.out.println("This ticket is a proof  that  " + nameA + " " +nameB + "  has made payment of  GHC " + ticketprice+ " for the busing");
    
    input.close();
     
  }
}
       
      
     
                          
    
     
    