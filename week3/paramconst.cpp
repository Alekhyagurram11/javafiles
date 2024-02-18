#include<iostream>
using namespace std;
class student{
    private:
        string fullname;
        int rollnum;
        double sempercentage;
        string collegename;
        int collegecode;
    public:
        student()
        {
            collegename = "MVGR";
            collegecode = 33;
        }
        student(string name,double percentage)
        {
            collegename = "MVGR";
            collegecode = 33;
            fullname = name;
            sempercentage = percentage;
        }
        ~student(){}
        void getstudentdetails()
        {
            cout << "The student details are as follows : " << endl;
            cout << "Name of the student : " << fullname << endl ;
            cout << "Rollno : " << rollnum << endl ;
            cout << "College : " << collegename << endl ;
            cout << "College code : " << collegecode << endl ;
            cout << "Sem percentage : " << sempercentage << endl ;
        }
        void studentrollno(int r)
        {
            rollnum = r;
        }
};

int main()
{
    student a;
    string name;
    double sempercent;
    int rollno;
    cout << "Enter the name of the student : ";
    getline(cin,name);
    cout << "Enter your Roll no : ";
    cin >> rollno;
    cout << "Enter your percentage : ";
    cin >> sempercent;
    a = {name,sempercent};
    a.studentrollno(rollno);
    a.getstudentdetails();                  
}
