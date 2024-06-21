#include <iostream>
using namespace std;

class static_ex{
    public:
    static_ex(){
        cout<<"Constructor Called"<<endl;
    }

    ~static_ex(){
        cout<<"Destructor Called"<<endl;
    }
};
void without_static_print()
{
    int x = 0;

    cout << "Value of X = " << x << endl;

    x++;
}

// Static keyword use case
//Static variables in a Function: When a variable is declared as static, space for it gets allocated for the lifetime of the program.
void with_satatic_print()
{
    static int x = 0;
    cout << "Value of x After Static : " << x << endl;
    x++;
}
int main()
{
    without_static_print();
    without_static_print();
    without_static_print();
cout<<endl;
    with_satatic_print();
    with_satatic_print();
    with_satatic_print();
cout<<endl;
    // static member functions usecase
    if(true){
        static static_ex obj;
    }
    cout<<"Static obj is called"<<endl;
    return 0;
}