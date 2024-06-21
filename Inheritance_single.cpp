#include <iostream>
using namespace std;

class Person
{
public:
    string name;
    int age;

    Person()
    {
        cout << "Parent Constructor" << endl;
    }

    ~Person()
    {
        cout << "Destroy Person Constructor" << endl;
    }
};

class Student : public Person
{
public:
    int rollno;

    Student()
    {
        cout << "Student Constructor" << endl;
    }

    void getInfo()
    {
        cout << "Student Details " << endl;
        cout << "Student name : " << name << endl;
        cout << "Student age : " << age << endl;
        cout << "Student roll no : " << rollno << endl;
    }

    ~Student()
    {
        cout << "Destroy Student Constructor" << endl;
    }
};
int main()
{
    Student jeet;
    jeet.name = "Jeet sharma";
    jeet.age = 20;
    jeet.rollno = 7107;

    jeet.getInfo();
}