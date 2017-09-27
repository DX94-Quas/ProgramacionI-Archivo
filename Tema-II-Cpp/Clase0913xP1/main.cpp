#include <iostream>

using namespace std;
//////////////////////////////////////////////////////////////////////////

bool ordenAsc(int a[],int n)
{
    int i = 0;
    while (i < n - 1)
    {
        if (a[i] > a[i + 1])
        {
            return false;
        }
        i = i + 1;
    }
    return true;
}

bool ordenDesc(int a[], int n)
{
    int i = 0;
    while (i < n - 1)
    {
        if (a[i] < a[i + 1])
        {
            return false;
        }
        i = i + 1;
    }
    return true;
}

int largo(int a[])
{
    return sizeof(a) / sizeof(int);
}

//////////////////////////////////////////////////////////////////////////

//1
int suma(int a[], int n)
{
    int sum = 0;
    int i = 0;
    while (i < n)
    {
        sum = sum + a[i];
        i = i + 1;
    }
    return sum;
}

//2
int menor(int a[], int n)
{
    int me = a[0];
    int i = 0;
    while (i < n)
    {
        if (a[i] < me)
        {
            me = a[i];
        }
        i = i + 1;
    }
    return me;
}

//3
int mayor(int a[], int n)
{
    int me = a[0];
    int i = 0;
    while (i < n)
    {
        if (a[i] > me)
        {
            me = a[i];
        }
        i = i + 1;
    }
    return me;
}

//4
int frecuencia(int a[], int x, int n)
{
    int tot = 0;
    int i = 0;
    while (i < n)
    {
        if (a[i] == x)
        {
            tot = tot + 1;
        }
        i = i + 1;
    }
    return tot;
}

//5
bool iguales(int a[], int n)
{
    int cp = a[0];
    int i = 0;
    while (i < n)
    {
        if (a[i] != cp)
        {
            return false;
        }
        i=i+1;
    }
    return true;
}

//6
bool ordenado(int a[],int n)
{
    return ordenAsc(a,n) || ordenDesc(a,n);
}

//7
bool diferentes(int a[], int n)
{
    int i = 0;
    while (i < n - 1)
    {
        if (a[i] == a[i + 1])
        {
            return false;
        }
        i = i + 1;
    }
    return true;
}

//8
int cantidadPares(int a[], int n)
{
    int tot = 0;
    int i = 0;
    while (i < n)
    {
        if (a[i] % 2 == 0)
        {
            tot = tot + 1;
        }
        i = i + 1;
    }
    return tot;
}

//9
int sumaImpares(int a[], int n)
{
    int tot = 0;
    int i = 0;
    while (i < n)
    {
        if (a[i] % 2 != 0)
        {
            tot = tot + a[i];
        }
        i = i + 1;
    }
    return tot;
}

//10
bool puroPares(int a[], int n)
{
    int i = 0;
    while (i < n)
    {
        if (a[i] % 2 != 0)
        {
            return false;
        }
        i = i + 1;
    }
    return true;
}

//11
bool existeParImpar(int a[], int n)
{
    return cantidadPares(a,n) != 0 && sumaImpares(a,n) != 0;
}

//12
bool palindrome(int a[], int n)
{
    int i=0;
    while (i<n)
    {
        if(a[i] != a[n-i-1]) return false;
        i=i+1;
    }
    return true;
}


int main()
{
    int a[] = {1,2,3,4,5};
    int n = largo(a);
    int input;
    cout<<"Seleccione un ejercicio: ";
    cin>> input;
    switch ( input )
    {
    case 1:            // Note the colon, not a semicolon
        cout << suma(a,n) << endl;
        break;
    case 2:            // Note the colon, not a semicolon
        cout << menor(a,n) << endl;
        break;
    case 3:            // Note the colon, not a semicolon
        cout << mayor(a,n) << endl;
        break;
    case 4:            // Note the colon, not a semicolon
        cout << frecuencia(a,2,n) << endl;
        break;
    case 5:
        cout << iguales(a,n) << endl;
        break;
    case 6:
        cout << ordenado(a,n) << endl;
        break;
    case 7:
        cout << diferentes(a,n) << endl;
        break;
    case 8:
        cout << cantidadPares(a,n) << endl;
        break;
    case 9:
        cout << sumaImpares(a,n) << endl;
        break;
    case 10:
        cout << puroPares(a,n) << endl;
        break;
    case 11:
        cout << existeParImpar(a,n) << endl;
        break;
    case 12:
        cout << palindrome(a,n) << endl;
        break;
    default:            // Note the colon, not a semicolon
        cout<<"Error, bad input.\n";
        break;
    }
    cin.get();

    return 0;
}
