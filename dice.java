public class dice{
  public static void main(String[] args){
    int roll, total;
    total = 0;
    
    do {
      roll = 1 + (int)(Math.random()*6);
      System.out.println("Computer rolled a dice " + roll + ".");
      if (roll ==1 ) {
        System.out.println("\t That ends its turn");
        total = 0;
        
      }
      else {
        total +=roll;
        System.out.print("\t Computer has " + total);
        System.out.print("  points so far this round. \n");
        if  (total <20) {
          System.out.println("\t Computer  will roll again");
        }
      }
    }
    while ( roll != 1 && total < 20 );
    System.out.println("Computer ends the round with " + total + " points.");
  }
}
        