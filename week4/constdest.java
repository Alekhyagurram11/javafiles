import java.util.Scanner;
class student{
    
        String fullname;
        int rollnum;
        double sempercentage;
        String collegename;
        int collegecode;

        student() {}
        student(String name,int roll,String college,int code,double percentage)
        {
            fullname = name;
            rollnum = roll;
            collegename = college;
            collegecode = code;
            sempercentage = percentage;

        }
        void printstudentdetails(){

            System.out.println("The student details are as follows : ");
            System.out.println("Name : "+fullname);
            System.out.println("Roll number : "+rollnum);
            System.out.println("College name : "+collegename);
            System.out.println("College Code : "+collegecode);
            System.out.println("Sem Percentage : "+sempercentage);

        }

    }
public class constdest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int roll;
        double sempercent;
        String collegename;
        int collegecode;
        System.out.print("Enter your Name : ") ;
        name = input.nextLine();
        System.out.print("Enter your Roll no : ");
        roll = input.nextInt();
        input.nextLine();
        System.out.print("Enter your College name : ");
        collegename = input.nextLine();
        System.out.print("Enter your College code : ");
        collegecode = input.nextInt();
        System.out.print("Enter your Sem Percentage : ");
        sempercent = input.nextInt();
        student obj = new student(name,roll,collegename,collegecode,sempercent);
        obj.printstudentdetails();
        input.close();
    }
    
}
