class Ability {

};
class Engineer : public Ability{

};

class engCapabilities {
private : 
    Ability *test;
public : 
    engCapabilities(Ability *x) {
        test = x;
    }
};

class SoftwareEngineer{
private :
    engCapabilities *ability;
public : 
    SoftwareEngineer(Ability *ability) {
        this->ability = new engCapabilities(ability);
    }
};
 
int main() {
    Engineer x;
    SoftwareEngineer y(&x);
}