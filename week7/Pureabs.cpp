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
    cout << "Enter the length of the square: "<<endl;
    s.getDimension();
    cout << "Area of square: " << s.calculateArea() << endl;
    cout << "Enter radius of the circle: "<<endl;
    c.getDimension();
    cout << "Area of circle: " << c.calculateArea() << endl;
}
