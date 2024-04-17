class Immutable{
    private final String a = "Alekhya";
    Immutable(String a){}
    void display()
    {
        System.out.println("Name : " +a);
    }
}
public class MutableAndImmutable {
    public static void main(String[] args) {
        //Mutable Object
        StringBuilder obj = new StringBuilder("Alekhya");
        obj.append(" ");
        obj.append("Gurram");
        String a = obj.toString();
        System.out.println("The final modified string : "+a);
        //Immutable object
        Immutable obj1 = new Immutable("Deadpool");
        obj1.display();
    }
}
