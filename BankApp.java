public class BankApp {
   public double balance = 0;
   private double exp = 0;
   private double dep = 0;
   public BankApp(){
      balance = 1000;
   }
   public BankApp(double balIn){
      balance = balIn;
   }
   public void makeDep(double depIn){
      dep += depIn;
      balance += depIn;
   }
   public void makeExp(double expIn){
      exp += expIn;
      balance -= expIn;
   }
   public double getExp(){
      return exp;
   }

   public double getDep(){
      return dep;
   }
   public String toString(){
      return "" +balance;
   }
}
