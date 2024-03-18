import java.util.Scanner;
class Parent{
    void print(){
        System.out.println("This is a Parent method.");
    }
}
class Child extends Parent{
    void print(String s){

        System.out.println("This is a Child method.");
        System.out.println("This method has a single parameter : " + s );
    }
}

class methodverloadinheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
        obj.print("MVGR");
    }
}
