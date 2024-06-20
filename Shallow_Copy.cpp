#include <iostream>
using namespace std;

class Car
{
public:
    string name;
    int price;

public:
    void setData(string name, int price)
    {
        this->name = name;
        this->price = price;
    }

    void printData()
    {
        cout << "------ Details Of The Car -------" << endl;
        cout << "Name : " << name << endl;
        cout << "Price : " << price << endl;
        cout<<endl;
    }

    
};
int main()
{
    Car Audi;
    Audi.setData("Audi" , 900000);

    Car Bmw(Audi);
    Audi.setData("Bmw" ,899999);

    Audi.printData();
    Bmw.printData();

// This is assignment operator which used in shallow copy creation
    Audi = Bmw;

    
    Audi.printData();
    Bmw.printData();

//     // obj creating
//     Car Audi;
//     Audi.setData("Audi" , 8000000);
//     // Audi.printData();
   
//     Car BMW = Audi;
//   // BMW.printData();

//     Audi.printData();
//     BMW.printData();
    return 0;
}