interface Shape {
    double calculateArea();
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() { return length * width; }
}
public class abstraction {
    public static void main(String[] args)
    {
        Circle c = new Circle(6.0);
        Rectangle r = new Rectangle(2.0, 4.0);
        System.out.println("Area of the Circle is : "+ c.calculateArea());
        System.out.println("Area of the Rectangle is: "+ r.calculateArea());
    }
}
