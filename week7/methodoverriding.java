class parent{
   public void display(){
       System.out.println("I'm in parent class.");
   }
}
class child extends parent{
   public void display(){
       super.display();
       System.out.println("I'm in child class.");
   }
}

public class methodoverriding {
   public static void main(String[] args) {
       child obj = new child();
       obj.display();

   }
}
