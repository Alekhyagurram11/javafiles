import java.util.Scanner;

public class methodoverload {
   public int add(int a, int b){
       return a+b;
   }
   public int add(int a, int b, int c){
       return a+b+c;
   }
   public static void main(String[] args) {
       methodoverload obj = new methodoverload();
       System.out.println("The addition of two numbers is "+obj.add(4,5));
       System.out.println("The addition of three numbers is "+obj.add(4,5,1));
   }
}
