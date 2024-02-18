#include<iostream>
using namespace std;
inline void displayWelcomeMessage()
{
  cout << "This is a welcome message!" << endl ;
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
        }
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
    cout << "Length : " << b.length << endl;
    cout << "Width : " << b.width << endl;
    cout << "Height : " << b.height << endl;
}
void Box:: boxvolume(float length,float width,float height)
{
    float volume = length*width*height;
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
