import java.util.Scanner;
import java.text.DecimalFormat;

public class Student{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      BankApp Au = new BankApp();
      FinanceTracker f; //= new FinanceTracker(Au.balance,0,Au.getExp(), Au.getDep());
      double wb = 0; 
      char code;
      System.out.print("Student Life Menu\n"
                       + "F - Finance Tracker\n"
                       + "S - Study Break\n" 
                       + "R - Ratio\n"
                       + "D - Make a Deposit\n" 
                       + "E - Make Expense\n"
                       + "Q - Quit");
   
      do {
         System.out.print("\nEnter Code [F, S, R, D, E, or Q]:");
         code = s.nextLine().charAt(0);
         System.out.println("");
         
         switch(code){
            case 'F':
               f = new FinanceTracker(Au.balance, wb, Au.getExp(), Au.getDep());
               wb =  f.getWBal();
               break;
               
            case 'S' :
               Stress();
               break; 
               
            case 'R':
               Ratio();
               break;     
           
            case 'D':
               System.out.print("Enter your deposit: ");
               double d = Double.parseDouble(s.nextLine());
               Au.makeDep(d);
               System.out.println("Current Balance " + Au.balance);
               break;
         
               
            case 'E':  
               System.out.print("Enter your expense: ");
               double e = Double.parseDouble(s.nextLine());
               Au.makeExp(e);
               System.out.println("Current Balance " + Au.balance);
               break;
         
            case 'Q':
               break;
         
            default:
               System.out.println("Error enter a valid choice."); 
         }
      
      
      }
      while(code != 'Q');
   }
}
