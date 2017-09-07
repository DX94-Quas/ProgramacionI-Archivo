#include <iostream>
#include <cmath>

using namespace std;

int suma(int n)
{
    int sum =1;
    for (int i=0;i<=n;i++)
    {
        int f=i;
        sum = f+i;
    }
    return sum;
}

int prod(int n)
{
    int p =1;
    for(int i=1;i<=n;i++)
    {
        p=p*i;
    }
    return p;
}

////////////////////////////////////////////////////////////////////////////////

// 1
int sumaEnt(int n)
{
    int sum = 0;
    for(int i = 1; i <= n; i++) sum += i;
    return sum;
}

//2
int sumaPares(int n)
{
    int sum = 0;
    for (int i=0;i<=n;i++)
    {
        sum = sum + i * 2;
    }
    return sum;
}

//3
int sumaImpares(int n)
{
    int sum = 1;
    for (int i=0;i<=n;i++)
    {
        sum = sum + (i * 2 -1);
    }
    return sum;
}

//4
int fact(int x)
{
    int i =1; int f=i;
    while(i<=x)
    {
        f = f*i;
        i = i+1;
    }
    return f;
}

//5
int comb(int n, int r)
{
    return fact(n)/(fact(r)*fact(n-r));
}

//6
int sumaCoef(int n){
    int r = 0;
    int sum = 0;
    while(r <= n){
        sum += comb(n, r);
        r++;
    }
    return sum;
}
// 7
int potencia(double x,double n)
{
    double pot=x;
    for(double i=0;i<n-1;i++)
    {
        pot = pot*x;
    }
    if(n == 0) return 1;
    else return pot;
}

//8
int SumatoriaPot(int x, int n)
{
    int sum=0;
    for (int i=0;i<=n;i++)
    {
        sum = sum + potencia(x,i);
    }
    return sum;
}

//9
void mostrarTabla(int n)
{
    for (int i=1;i<=n;i++)
    {
        for (int j=1;j<=n;j++)
        {
            int res = i*j;
            cout << i << "*" << j << "=" << res << endl;
        }
    }
}

//10
void mostrarFactores(int n)
{
    for (int i=1;i<=n;i++)
    {
        for (int j=1;j<=n;j++)
        {
            int res = i*j;
            if (res==n)
            {
                cout << i << "*" << j << "=" << res << endl;
            }
        }
    }
}

int signo(int n)
{
    if (n%2 == 0) return 1;
    else return -1;
}

//11
int sumaInterc(int n)
{
    int sum =0;
    for(int i =0; i<=n;i++)
    {
        sum = sum + signo(i)*i;
    }
    return sum;
}

//12
double sumaGeom(int n)
{
    double sum = 0.0;
    double i =0.0;
    while (i<=n)
    {
        sum = sum + (1/std::pow(2.0,i));
        i = i+1;
    }
    return sum;
}

//13
double sumaArmonica(int n)
{
    double sum = 0.0;
    double i =1;
    while (i<=n)
    {
        sum = sum + 1 / i;
        i = i+1;
    }
    return sum;
}

//14
double sumaArmonicaAlterna(int n)
{
    double sum = 0.0;
    double i =1;
    while (i<=n)
    {
        sum = sum + signo(i)*(1 / i);
        i = i+1;
    }
    return sum;
}

//15
double sumaCuadrados(int n)
{
    double sum =0.0;
    double i = 1.0;
    while (i<=n)
    {
        sum = sum + (1/std::pow(i,2.0));
        i = i+1;
    }
    return sum;
}

//16
int sumaEscalada(int n)
{
    int sum=0;
    for(int i=1 ;i<=n ;i++)
    {
        for(int j=1;j<=n;j++)
        {
            //sum = sum + j
            sum += j;
        }
    }
    return sum;
}

//17
int sumaPiCuartos(int n)
{
    int sum = 0;
    for(int i = 1; i <= n; i++) sum += (potencia(-1, i+1) * (1/((2*i) -1)));
    return sum;
}

//18
int sumaProd(int n)
{
    int sum=0;
    for(int i=1 ;i<=n ;i++)
    {
        for(int j=1;j<=n;j++)
        {
            sum += i*j;
        }
    }
    return sum;
}

// 19
int sumaExp(int x, int n)
{
    int sum = 0;
    for(int i = 0; i <= n; i++) sum += (potencia(x, i) / fact(i));
    return sum;
}

// 20
int sumaSen(int x, int n)
{
    int sum = 0;
    for(int i = 0; i <= n; i++)
    {
        sum += ((potencia(-1, i) / (fact((2*i) + 1))) * potencia(x, ((2*i) + 1)));
    }
    return sum;
}

// 21
int sumaCos(int x, int n)
{
    int sum = 0;
    for(int i = 0; i <= n; i++)
    {
        sum += ((potencia(-1, i) / fact(2 * i)) * potencia(x, (2*i)));
    }
    return sum;
}

///////////////////////////////////////////////////////////////////////////////

int main()
{
    cout << suma(5) << endl;
    cout << sumaPares(3) << endl;
    cout << sumaImpares(4) << endl;
    cout << potencia(2,0) << endl;
    cout << SumatoriaPot(2,3) << endl;
    mostrarTabla(3);
    mostrarFactores(12);
    cout << sumaInterc(3) << endl;
    cout << sumaGeom(5) << endl;
    cout << sumaArmonica(3) << endl;
    cout << sumaArmonicaAlterna(5) << endl;
    cout << sumaCuadrados(3) << endl;
    return 0;
}
