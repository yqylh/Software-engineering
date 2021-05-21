//测试设计主调程序 
#include "Point.h"
#include "Line.h" 
#include "Rectangle.h" 
#include "Circle.hpp"
#include "UI.h"

main(){ 
	UI ui;
	 
	Point p1(1,2),p2(7,8);
	ui.shapeVector.push_back(&p1);
	ui.shapeVector.push_back(&p2);
		
	ui.shapeVector.push_back(new Line(p1,p2));
	
	ui.shapeVector.push_back(new Rectangle(p1,5,6));
	ui.shapeVector.push_back(new Circle(p1, 5));
    ui.show();
}
 
