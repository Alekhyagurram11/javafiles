#include<iostream>
using namespace std;

class AccessSpecifierDemo{
   private:
       int privar;
   protected:
       int provar;
   public:
       int pubvar;

   public:
       void setvar(int privalue, int provalue, int pubvalue)
       {
           this->privar = privalue;
           this->provar = provalue;
           this->pubvar = pubvalue;
       }

       void getvar(){
           cout << "Private Variable : " << privar << endl;
           cout << "Protected Variable : " << provar << endl;
           cout << "Public Variable : " << pubvar << endl;
       }

};

int main(){
   AccessSpecifierDemo obj;
   int privalue, provalue, pubvalue;
   cout << "Enter the value of Private Variable : ";
   cin >> privalue;
   cout << "Enter the value of Protected Variable : ";
   cin >> provalue;
   cout << "Enter the value of Public Variable : ";
   cin >> pubvalue;
   obj.setvar(privalue, provalue, pubvalue);
   obj.getvar();
}
