#include<iostream>
using namespace std;

class addition{
   public:
       int add(float a, float b)
       {
           return a+b;
       }
       int add(float a, float b, float c)
       {
           return a+b+c;
       }
};
int main()
{
   addition obj;
   cout << "The addition of two numbers is "<< obj.add(4,5) << endl;
   cout << "The addition of three numbers is "<< obj.add(4,5,1) << endl;
   return 0;
}
