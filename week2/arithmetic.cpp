#include<iostream>
#include<string>
using namespace std;
int main()
{
    float number1, number2;
    int choice;
    cout <<"Enter the value of number1 : ";
    cin >>number1;
    cout <<"Enter the value of number2 : ";
    cin >>number2;
    cout <<"The operations are : "<<endl;
    cout <<"1.Addition, 2.Subtraction, 3.Multiplication, 4.Division"<<endl;
    cout <<"Enter the choice : ";
    cin >> choice;
    switch(choice)
    {
        case 1:
        {
            cout <<"The Addition of "<<number1 <<" and " <<number2<<" is "<<(number1+number2)<<"."<<endl;
            break;
        }
        case 2:
        {
            cout <<"The Subtraction of "<<number1 <<" and " <<number2<<" is "<<(number1-number2)<<"."<<endl;
            break;
        }
        case 3:
        {
            cout <<"The Multiplication of "<<number1<<" and "<<number2<<" is "<<(number1*number2)<<"."<<endl;
            break;
        }
        case 4:
        {
            cout <<"The Division of "<<number1<<" and "<<number2<<" is "<<(number1/number2)<<"."<<endl;
            break;
        }
        default:
        {
            cout <<"Enter valid choice!"<<endl;
            break;
        }
    }

}
