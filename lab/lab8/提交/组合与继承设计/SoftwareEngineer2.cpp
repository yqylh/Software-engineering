class Engineer{
private :

public : 

};

class engCapabilities {
private : 
    Engineer *test;
public : 
    engCapabilities(Engineer *x) {
        test = x;
    }
};

class SoftwareEngineer{
private :
    engCapabilities *ability;
public : 
    SoftwareEngineer(Engineer *ability) {
        this->ability = new engCapabilities(ability);
    }
};
 