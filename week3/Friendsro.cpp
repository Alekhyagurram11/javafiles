#include<iostream>
using namespace std;
inline void displayWelcomeMessage() 
{
  cout << "This is welcome message!" << endl ;
}
class Box{
    public:
        float length,width,height;
        Box(){
            length = width = height = 1;
        }
        Box(float l, float b,float h)
        {
            length = l ;
            width = b ;
            height = h ;
            cout << "I'm created!!" << endl;
        }
        ~Box(){}
        void boxArea(float length,float width,float height)
        {
            float area = 2*(length*width + width*height + height*length);
            cout << "The Area of the box is " << area << endl;
        }
        void boxvolume(float length,float width,float height);
        friend void displayBoxDimensions(Box);
};
void displayBoxDimensions(Box b)
{
    cout << "length : " << b.length << endl;
    cout << "width : " << b.width << endl;
    cout << "height : " << b.height << endl;
}
void Box:: boxvolume(float length,float width,float height)
{
    float vol = length*width*height;
    cout << "The Volume of the box is " << vol << endl;
}
int main()
{
    displayWelcomeMessage();
    float length,width,height;
    cout << "Enter the length, width and height : ";
    cin >> length;
    cin>> width;
    cin>> height ;
    Box d(length,width,height);
    displayBoxDimensions(d);
    d.boxArea(d.length,d.width,d.height);
    d.boxvolume(length,width,height); 
}
