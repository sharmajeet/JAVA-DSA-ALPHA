#include <iostream>
using namespace std;

// in which class pure virtual functions are present that all classes are automatically Abstract Class.
class Shape
{
public:
    // abstract class
    // pure virtual function
    virtual void draw() = 0;
};

class Circle : public Shape
{
public:
    void draw()
    {
        cout << "Shapping a Circle" << endl;
    }
};
int main()
{

    Circle c1;
    c1.draw();
}