#ifndef _UI_H
#define _UI_H

#include<vector>
#include"Shape.h" 

class UI{
  public:
	vector<Shape*> shapeVector;   //������״��ͳһ����
	void show(){
		for(int i=0;i<shapeVector.size();i++)
		 	shapeVector[i]->show();    //��̬ 
	}
};

#endif
