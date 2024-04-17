#include<iostream>
using namespace std;
template <class T>
class Calculator
{
    private:
    T num1, num2;
    public:
    Calculator(T number1, T number2)
    {
        num1 = number1;
        num2 = number2;
    }
    void displayResult()
    {
        cout << "The Numbers are: " << num1 << " and " << num2 << "." << endl;
        cout << "Addition : " << add() << endl;
        cout << "Subtraction : " << subtract() << endl;
        cout << "Product : " << multiply() << endl;
        cout << "Division : " << divide() << endl;
    }
    T add() { return num1 + num2; }
    T subtract() { return num1 - num2; }
    T multiply() { return num1 * num2; }
    T divide() { return num1 / num2; }
};
int main()
{
    Calculator<int> intCalc(5,10);
    intCalc.displayResult();
}
