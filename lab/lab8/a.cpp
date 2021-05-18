#include <iostream>

class Person {
public:
    virtual void Strength() = 0;
};

class Adult : public Person {
public:
    virtual void Strength()
    {   
        std::cout << "Adult have big Strength!" << std::endl;
    }   
};

class Child : public Person {
public:
    virtual void Strength()
    {   
        std::cout << "Child have Small Strength!" << std::endl;                                                                                   
    }   
};
class CALL {
public : 
    Person *ptr;
    void testfunc(Person *input) {
        ptr = input;
        ptr->Strength();
    }
};
int main() {
    CALL call;
    Child X;
    call.testfunc(&X);
    Adult Y;
    call.testfunc(&Y);
    return 0;
}