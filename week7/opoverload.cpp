#include<iostream>
using namespace std;

class complex {
   private:
       int real;
       int imaginary;

   public:
       complex(int real, int imaginary)
       {
           this->real = real;
           this->imaginary = imaginary;
       }
       void print(){
           cout << real << "+" << imaginary << "i"<<endl;
       }
       complex operator+(complex b)
       {
           complex c(0,0);
           c.real = this->real + b.real;
           c.imaginary = this->imaginary + b.imaginary;
           return c;
       }

};
int main()
{
   complex a(2,3);
   complex b(3,2);
   complex c = a + b;
   c.print();
   return 0;
}
