#include<iostream>
using namespace std;
class A
{
    public:
        int a=10;
        void displayA()
        {
            cout<<"I'm in class A"<<endl;
        }
};
    
class B : public virtual A
{
    public:
        int b=20;
        void display()
        {
            cout<<"I'm in class B"<<endl;
        }
};

class C : public virtual A
{
    public:
        void display()
        {
            cout<<"I'm in class C"<<endl;
        }
};

class D : public B, public C
{
    public:
        void show()
        {
            cout<<a<<endl;
            displayA();
            B::display(); 
            cout<<b<<endl;
            C::display();
        }
};

int main()
{
    D obj;
    obj.show();
    return 0;
}
