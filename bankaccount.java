//import static java.lang.System.*;

import java.util.Scanner;

public class bankaccount {
  public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    
    int amount, deposit, depo, withdraw, with;
    String request ;
    
    System.out.println(" *************Welcome to Ecobank. ****************** ");
    System.out.println("Enter your balance");
    amount = input.nextInt();
    
    System.out.println("Kindly choose the following option");
    System.out.println("1.  Deposit");
    System.out.println("2.  Withdraw");
    System.out.println("3.  Inquiry");
    request = input.next();
    
    
    if (request.equals("Deposit")){
      System.out.println("How much are you depositing?");
      deposit = input.nextInt();
      depo = amount + deposit;
      System.out.println("Your new balance is :  " + depo); 
    }
    if (request.equals("Withdraw")) {
      System.out.println("How much are you withdrawing?");
      withdraw = input.nextInt();
      with = amount - withdraw;
      System.out.println("Your new balance is : " + with);
    }
    if (request.equals("Inquiry")) {
      System.out.println("Your balance is : " + amount);}
    
    input.close();
  }
}   

    
      
    