#include <iostream>

using namespace std;

/*
 * Puntero -    Es una variable que contiene una direccion de memoria
 *              esta en hexadecimal, se obtiene al preopner "&" a la
 *              variable en cuestion
*/

void intercambiar(int x, int y)
{
    int aux = x;
    x=y;
    y=aux;
}

void intercambiarRef(int &x, int &y)        // address-of operator(&) x, y
{
    int aux = x;
    x=y;
    y=aux;
    cout << "&x = " << &x << endl;
    cout << "&y = " << &y << endl;
}

void intercambiarPuntero(int *p, int *q)    // value pointed to by(*) p, and q
{
    int aux = *p;
    *p=*q;
    *q=aux;
    cout << "P = " << *p << endl;
    cout << "q = " << *q << endl;
}

///////////////////////////////////////////////////////////////////////////////

int main()
{
    int a=1250,b=75;
    //intercambiarRef(a,b);
    intercambiarPuntero(&a,&b);
    cout << "///////////////////////////"<< endl;
    cout << "&a = " << &a << endl;
    cout << "&b = " << &b << endl;
    cout << "///////////////////////////"<< endl;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    return 0;
}


