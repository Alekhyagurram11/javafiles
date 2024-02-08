#include<iostream>
#include<string>
using namespace std;
void check(int number)
{
    if(number % 2 == 0)
    {
        cout <<"The number "<<number<<" is an EVEN number."<<endl;
    }
    else
    {
        cout <<"The number "<<number<<" is an  ODD number."<<endl;
    }
}
int main()
{
    int number;
    cout <<"Enter the number : ";
    cin >>number;
    check(number);
}
