import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        float a,b;
        System.out.print("Enter the value of a : ");
        a = input.nextFloat();
        System.out.print("Enter the value of b : ");
        b = input.nextFloat();
        System.out.print("The operations are: \n1.Addition, 2.Subtraction, 3.Multiplication,4.Division\n");
        System.out.print("Enter your Choice: ");
        choice = input.nextInt();
        if(choice == 1)
        {
            System.out.print("The Addition of "+ a +" and "+ b +" is "+(a+b));
        }
        else if(choice == 2)
        {
            System.out.print("The Subtraction of "+ a +" and "+ b +" is "+(a-b));   
        }
        else if(choice == 3)
        {
             System.out.print("The Multiplication of "+ a +" and "+ b +" is "+(a*b));
        }
        else if(choice == 4) 
        {
             System.out.print("The Division of "+ a +" and "+ b +" is "+(a/b));
        }
        else
        {
              System.out.print(“Invalid Choice\n”);
        }    
    }
}
