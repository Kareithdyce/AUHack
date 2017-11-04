import java.util.Random;
/** 
 * Outputs a motivational quote for the student.
 */
 
public class Motivation {
 
   Random r = new Random();
   
   int low = 1;
   int high = 101;
   int result = r.nextInt(high - low) + low;
   
}