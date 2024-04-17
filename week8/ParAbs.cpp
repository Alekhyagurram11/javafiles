#include <iostream>
using namespace std;
// Abstract class
class Shape {
    protected:
    float dimension;
    public:
    void getDimension() 
    {
        cin >> dimension;
    }
    void display()
    {
        cout<<"I'm partial"<<endl;
    }
// pure virtual Function
    virtual float calculateArea() = 0;
};
class Square : public Shape {
    public:
    float calculateArea() 
    {
        return dimension * dimension;
    }
};
class Circle : public Shape {
    public:
    float calculateArea() 
    {
        return 3.14 * dimension * dimension;
    }
};
int main() {
    Square s;
    Circle c;
    s.display();
    cout << "Enter the length of the square : ";
    s.getDimension();
    c.display();
    cout << "Area of the square is : " << s.calculateArea() << endl;
    cout << "Enter the radius of circle : ";
    c.getDimension();
    cout << "Area of the circle is : " << c.calculateArea() << endl;
}
