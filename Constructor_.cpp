#include <iostream>
using namespace std;

class Teacher
{
private:
    int salary;

public:
    string name;
    string dept;
    string subject;

    // constructor : Non-Parameterized
    // Teacher()
    // {
    //     dept = "Computer Science";
    // }

    // Constructor : Parameterized
    Teacher(string n, string d, string sub, int sal)
    {
        name = n;
        dept = d;
        subject = sub;
        salary = sal;
    }
};
int main()
{

    //  Teacher t1;
    //  t1.name = "Shradha";
    //  t1.subject = "OOPS";

    Teacher t1("Sharadha", "Computer Science", "OOPs", 40000);
    cout << "Faculty Name : " << t1.name << endl;
    cout << "Faculty Department : " << t1.dept << endl;
    cout << "Faculty Subject : " << t1.subject << endl;
    //  cout<<"Faculty Salary : " << t1.salary <<endl;
}