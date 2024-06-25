#include <iostream>
using namespace std;

class Parent
{
public:
    void getInfo()
    {
        cout << "I am From Parent class \n";
    }

    virtual void hello()
    {
        cout << "Hello! , i am from parent class" << endl;
    }
};

class Student : public Parent
{
public:
    //  getInfo() is override by the child class and now child class having higest priority .
    void getInfo()
    {
        cout << "I am from Student Class \n";
    }

    // virtual function override by child class
    void hello()
    {
        cout << "Hello! , i am from child class" << endl;
    }
};
int main()
{

    Student s1;
    // s1.getInfo();
    // virtual function implementation
    s1.hello();
}