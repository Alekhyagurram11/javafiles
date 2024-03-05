class Animal
{
    public void eat()
    {
        System.out.println("I can eat.");
    }
    public void sleep()
    {
        System.out.println("I can sleep.");
    }
}
class Dog extends Animal
{
    public String name = "Caeser";
    public void display()
    {
        System.out.println("My name is "+name+".");
    }
    public void bark()
    {
        System.out.println("I can bark.");
    }
}
public class SimpleInheritance
{
    public static void main(String[] args)
    {
        Dog Puppy=new Dog();
        Puppy.display(); 
        Puppy.sleep(); 
        Puppy.eat();
        Puppy.bark(); 
    }
}
