import java.util.Scanner;

public class grandma {
  public static void main( String[] args){
   
  Scanner input = new Scanner(System.in);
  
  String name;
  int age;
  double cute, income;
  boolean allowed;
  
  System.out.println("What his name?");
  name = input.next();
  
  System.out.println("What is his age?");
  age = input.nextInt();
  
  System.out.println("Range of his income");
  income = input.nextDouble();
  
  System.out.println("From 0-10, what is his cuteness?");
  cute = input.nextDouble();
  
  allowed = (age > 25   &&   age < 40    &&    ( income > 5000 || cute >=8.5 ));
  
  System.out.println( "Does " + name + "qualify to marry my granddaughter: "  + allowed);
  
  input.close();
  }
}
