import java.util.Scanner;

/** 
  * Measures stress levels of college students.
  */
  
public class Stress {

   public static void main(String[] args) {
   // variable representing stress level
      int s = 0;
   
      Scanner scan = new Scanner(System.in);
      // Prompt user to enter stress level number
      System.out.print("On a scale of 1 to 5 with 1 being low"
         + " and 5 being extreme, indicate your stress level: ");
      s = scan.nextInt();
      if (s == 0 || s >= 5) {
         System.out.println("Invalid response. Try again.");
         s = scan.nextInt();
      } 
      else { 
         if (s == 1 || s == 2) {
            System.out.println("Stress levels are good. Remember to avoid caffeine.");
            s = scan.nextInt();
         }
         
         if (s == 3 || s == 4) {
            System.out.println("Stress levels are moderately high. Be sure to get enough rest.");
            s = scan.nextInt();
         }
         
         if (s == 5) {
            System.out.println("Stress levels are too high. Seek immediate assistance.");
            s = scan.nextInt();
         }
           
      }
   
   }

}