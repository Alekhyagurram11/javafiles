#include<iostream>
#include "boxArea.h"
#include "boxVolume.h"

int main()
{
   float length, width, height;
   cout<<"Enter the length, width and height of the box : "<<endl;
   cin>>length;
   cin>>width;
   cin>>height;

   boxArea(length,width,height);
   boxVolume(length, width, height);
}
