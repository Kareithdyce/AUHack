import java.util.Scanner;

/** 
  * Calculates the ideal ratio of relaxtion to study time.
  */
  
public class Ratio {

   public static void main(String[] args) {
      
      int st = 0;
      
      Scanner userInput = new Scanner(System.in);
      // Prompt user for study time
      System.out.print("Enter the study time in hours: ");
      st = userInput.nextInt();
      if (st >= 4) {// Prompt for relax time
         System.out.println("Take a break from studying!");
      }
      // Prompt for relax time
      else {
         int three = 30;
         System.out.println("Relaxation Time: " + three + " minutes");
           
      }
   }

}
