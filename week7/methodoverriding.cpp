#include<iostream>
using namespace std;

class Parent{
    public:
    void print(){
        cout << "This is a Parent method." << endl;
    }  
  
};

class Child : public Parent{
    public:
    void print(){
        
        cout << "This is a Child method." << endl;
    }
};

int main(){
    
    Child obj;
    obj.print();

}
