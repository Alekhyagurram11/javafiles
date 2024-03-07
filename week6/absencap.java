import java.util.Scanner;
class AccessSpecifierDemo{
   private int privar;
   protected int provar;
   public int pubvar;

   public void setvar(int privalue, int provalue, int pubvalue)
   {
       this.privar = privalue;
       this.provar = provalue;
       this.pubvar = pubvalue;
   }

   public void getvar()
   {
       System.out.println("Private Variable : " +privar);
       System.out.println("Protected Variable : " +provar);
       System.out.println("Public Variable : " +pubvar);
   }
      
}  
public class absencap{
   public static void main(String[] args) {
       AccessSpecifierDemo obj = new AccessSpecifierDemo();
       Scanner input = new Scanner(System.in);
       int privalue, provalue, pubvalue;
       System.out.print("Enter the value of Private Variable : ");
       privalue = input.nextInt();
       System.out.print("Enter the value of Protected Variable : ");
       provalue = input.nextInt();
       System.out.print("Enter the value of Public Variable : ");
       pubvalue = input.nextInt();
       obj.setvar(privalue, provalue, pubvalue);
       obj.getvar();
       input.close();

   }
}
