#include <iostream>

using namespace std;

int suma(int a, int b)
{
    return a+b;
}

int modulo(int x, int y)
{
    return x % y;
}

int mayor(int x, int y)
{
    if (y > x) return y;
    else return x;
}

int factorial(int x)
{
    int i =1; int f=i;
    while(i<=x)
    {
        f = f*i;
        i = i+1;
    }
    return f;
}

int mayorBin(int a, int b, int c)
{
    if(a>b)
        if(a>c) return a;
        else return c;
    else if (b>c) return b;
        else return c;
}

int main()
{
    cout << "Hello World!" << endl;
    cout << suma(5,3) << endl;
    cout << modulo(10,5) << endl;
    cout << mayor(100,4) <<endl;
    cout << factorial(5) <<endl;
    cout << mayorBin(1,2,3) <<endl;
    return 0;
}

