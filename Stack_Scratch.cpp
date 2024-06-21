#include <iostream>
using namespace std;

class Stack
{
public:
    int *arr;
    int size;
    int top;

    // constructor
    Stack(int size)
    {
        arr = new int[size];
        this->size = size;
        top = -1;
    }

    // oprtation on stack
    int getSize()
    {
        return top + 1;
    }

    void push(int data)
    {
        if (size - top > 1)
        {
            // space available
            top++;
            arr[top] = data;
        }
        else
        {
            cout << "Stack is overflow" << endl;
        }
    }

    int pop()
    {
        if (top == -1)
        {
            cout << "Stack is underflow" << endl;
        }
        else
        {
            int data = arr[top];
            top--;
            return data;
        }
    }

    int getTop()
    {
        return arr[top];
    }

    bool isEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};
int main()
{
    Stack mystack(5);
    mystack.push(10);
    mystack.push(20);
    mystack.push(30);
    mystack.push(40);

    cout<<"Size Of The Stack : " <<mystack.getSize()<<endl;

    while (!mystack.isEmpty())
    {
        cout << mystack.pop() << " ";
    }


}