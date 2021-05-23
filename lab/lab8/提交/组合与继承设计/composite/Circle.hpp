#ifndef __Circle__
#define __Circle__
#include "Point.h"
#include <iostream>
class Circle{
private :
    Point center;
    double radius;
public :
    Circle(const Point & A, float r) {
        center = A;
        radius = r;
    }
    void show() {
        std::cout << "Circle : (" << center.getX() << "," << center.getY() << " ) r = " << radius << std::endl; 
    }
    Point getCenter() {
        return center;
    }
    double getRadius() {
        return radius;
    }
};
#endif