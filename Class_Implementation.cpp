// Classes are simply blueprints for creating objects.
// A class has its own attributes, objects, and methods.
// In simple terms:
// Attributes: What the class looks like
// Methods: What the class does
// Objects: What the class is

#include <iostream>
using namespace std;

class Car {
public:
    string name;
    string model;
    int price;

    // Parameterized constructor for uniform initialization
    // Car(string n, string m, int p) : name(n), model(m), price(p) {}
};

int main() {
    // Creating an object of class Car using "stack allocation"
    Car c1;

    // Creating an object of class Car using "heap allocation"
    Car *c2 = new Car();

    // Creating an object of class Car using "uniform initialization"
    Car c3{"Toyota", "TX1", 500000};

    // Setting attributes for car1
    c1.name = "Tata Safari";
    c1.model = "X1";
    c1.price = 1000000;

    // Setting attributes for car2
    c2->name = "BMW";
    c2->model = "X7";
    c2->price = 8000000;

    // Printing details of car1
    cout << "Name : " << c1.name << endl;
    cout << "Model : " << c1.model << endl;
    cout << "Price : " << c1.price << endl;
    cout<<endl;

    // Printing details of car2
    cout << "Name : " << c2->name << endl;
    cout << "Model : " << c2->model << endl;
    cout << "Price : " << c2->price << endl;
    cout<<endl;

    // Printing details of car3
    cout << "Name : " << c3.name << endl;
    cout << "Model : " << c3.model << endl;
    cout << "Price : " << c3.price << endl;
    cout<<endl;
    
    // Deleting the dynamically allocated object
    delete c2;

    return 0;
}
