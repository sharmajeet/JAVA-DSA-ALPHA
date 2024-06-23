#include <iostream>
using namespace std;

class Student
{
public:
    string name;
    int age;

    // Constructor overloading
    // Student()
    // {
    //     cout << "Non-Parameterized Constructor" << endl;
    // }

    // Student(string name)
    // {
    //     this->name = name;
    //     cout << "Parametrized constructor" << endl;
    // }

    // Student(string name, int age)
    // {
    //     this->name = name;
    //     this->age = age;
    //     cout << "2nd parameterized constructor" << endl;
    // }

    // Function Overloading Section
    void getDetails()
    {
        cout << "This is default section" << endl;
    }

    void getDetails(string name)
    {
        cout << "Name of the student is : " << name << endl;
    }

    void getDetails(string name, int age)
    {
        cout << "Name of student is  : " << name << endl;
        cout << "Age of the student is : " << age << endl;
    }

    // Operator Overloading Section
    
};
int main()
{
    // Constructor overloading section
    // Student s1;
    // Student("Jeet Sharma");
    // Student("Jeet", 20);
    // return 0;

    // Function Overloading Section
    Student s1;
    s1.getDetails();
    s1.getDetails("Jeet Sharma");
    s1.getDetails("Jeet Sharma", 20);
}