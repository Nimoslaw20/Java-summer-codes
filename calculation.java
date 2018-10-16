import java.util.Scanner;
public class calculation {
  public static void main( String[] args){
    
    Scanner input = new Scanner(System.in);
    double mass, acceleration, force;
      
    System.out.println("Welcome to the force calculator");
    System.out.println("Enter the mass of  the object");
    mass = input.nextDouble();
    
    System.out.println("Enter the acceleration of  the object");
    acceleration = input.nextDouble();
    
    force = mass * acceleration;
    
    System.out.println("The force of the object in Newtons (N) is " + force);
    
    if (force > 10) {
      System.out.println("The force has a greater impact");
    }
    
    if (force < 10) {
      System.out.println("The force is negligible");
    }
    
    input.close();
  }
}