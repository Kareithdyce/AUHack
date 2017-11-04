import java.util.Scanner;
import java.text.DecimalFormat;

public class FinanceTracker {
   private double cBal = 0;
   private double wBal = 0;
   private double exp = 0;
   private double dep = 0;


   public FinanceTracker(double cBalIn, double wBalIn, double expIn,  double depIn) {
      setCBal(cBalIn);
      setWBal(wBalIn);
      setExp(expIn);
      setDep(depIn);
   
      Scanner s = new Scanner(System.in);
      //For the percent and money
      DecimalFormat p = new DecimalFormat("#0.00");
   
      if(wBal == 0) {
         System.out.print("Enter your desired weekly goal: ");
         setWBal(s.nextDouble());
      }
   
      System.out.println("You currently have $" + p.format(balRem()) +" left.");
      System.out.println("You have " + p.format(perRem()) + "% of your weekly goal of your weekly goal less.");
      if(perRem() < 0){
         System.out.println("You have gone over your budget. Please limit yourself!");
      }
      else {
         System.out.println("Good work managing your budget!");
      }
   
   
   }
   /*
   Mutators
   */

   public void setCBal(double cBalIn){
      cBal = cBalIn;
   }
   public void setWBal(double wBalIn){
      wBal = wBalIn;
   }
   public void setExp(double expIn){
      exp = expIn;
   }
   public void setDep(double depIn){
      dep = depIn;
   }

   /*
   Accessors
   */

   public double getCBal(){
      return cBal;
   }

   public double getWBal(){
      return wBal;
   }
   public double getExp(){
      return exp;
   }
   public double getDep(){
      return dep;
   }

   //Calculates the remaining budget
   public double balRem(){
      return (wBal - exp) + dep;
   }
   //Calculates the remaining budget as a percent
   public double perRem(){
      return  balRem() / wBal * 100;
   }


}
