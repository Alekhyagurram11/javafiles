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
        student() {}
        student(string name,int roll,string college,int code,double percentage)
        {
            fullname = name;
            rollnum = roll;
            collegename = college;
            collegecode = code;
            sempercentage = percentage;

        }
        ~student(){
            cout << "I'm dead!!" <<endl;
        }
        void printstudentdetails()
        {
            cout << "The student details are as follows : " << endl;
            cout << "Name of the student : " << fullname << endl;
            cout << "Rollno : " << rollnum << endl;
            cout << "College : " << collegename << endl;
            cout << "College Code : " << collegecode << endl;
            cout << "Sem Percentage : " << sempercentage  << endl;
        }    
};

int main()
{
    string name;
    int roll;
    double sempercent;
    string collegename;
    int collegecode;
    cout << "Enter your Name : " ;
    getline(cin,name);
    cout << "Enter your Roll no : " ;
    cin >> roll;
    cout << "Enter your College name : " <<ends;
    cin >> collegename;
    cout << "Enter your College code : " ;
    cin >> collegecode;
    cout << "Enter your Sem Percentage : " ;
    cin >> sempercent;

    student a(name,roll,collegename,collegecode,sempercent);

    a.printstudentdetails();
   
}
