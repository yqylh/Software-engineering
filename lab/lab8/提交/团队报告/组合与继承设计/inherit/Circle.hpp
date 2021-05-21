#ifndef __Circle__
#define __Circle__
#include "Shape.h"
#include "Point.h"
#include <iostream>
class Circle : public Shape{
private :
    Point center;
    double radius;
public :
    Circle(const Point & A, float r) {
        center = A;
        radius = r;
    }
    virtual void show() {
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