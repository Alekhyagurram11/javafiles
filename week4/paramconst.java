import java.util.Scanner;
class student{
        String fullname;
        int rollnum;
        double sempercentage;
        String collegename;
        int collegecode;

        student()
        {
            collegename = "MVGR";
            collegecode = 33;
        }
        student(String name,double percentage)
        {
            collegename = "MVGR";
            collegecode = 33;
            fullname = name;
            sempercentage = percentage;
        }
        void printstudentdetails(){
            System.out.println("The student details are as follows : ");
            System.out.println("Name : "+fullname);
            System.out.println("College name : "+collegename);
            System.out.println("College code : "+collegecode);
            System.out.println("Sem Percentage : "+sempercentage);
        }
}

public class paramconst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double sempercent;
        System.out.print("Enter your Name : ") ;
        name = input.nextLine();
        System.out.print("Enter your Sem Percentage : ");
        sempercent = input.nextInt();
        student obj = new student(name,sempercent);
        obj.printstudentdetails();
        input.close();
    }
}
