#include<iostream>
using namespace std;
class Parent{
    public:
    int publicVar=10;

    private:
    int privateVar=20;

    protected:
    int protectedVar=30;

    public:
    void getPrivateVar(){
        cout<<"Private Variable is "<<privateVar<<endl;
    }
};

class Child : public Parent{
    public:
    int temp = protectedVar;
};

int main(){
    Child obj;
    cout<<"Using Public Inheritance : "<<endl;
    cout<<"Public variable is "<<obj.publicVar<<endl;
    obj.getPrivateVar();
    cout<<"Protected Variable is "<<obj.temp<<endl;
}
