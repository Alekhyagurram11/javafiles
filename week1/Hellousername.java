import java.util.Scanner;
public class Hellousername{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a;
        System.out.print("Enter username: ");
        a = input.next();
        System.out.println("Hello"+" "+a);
    }
}
