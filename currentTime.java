import java.text.SimpleDateFormat;
import java.util.Calendar;

public class currentTime {
      
      public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println( sdf.format(cal.getTime()) );
      if (cal.getTime().toString().contains("23:00")){ // Sets up notification for the following day's assignments
      System.out.print(" Here are tomorrow's assignments!! ");
      }
      if (cal.getTime().toString().contains("07:00")){
      System.out.print(" Here is today's motivational quote: ");
      }
   }
}