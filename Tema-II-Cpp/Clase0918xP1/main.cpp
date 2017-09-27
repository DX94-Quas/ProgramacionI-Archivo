#include <iostream>
#include <string.h>

/*
 *
    letraMin(ch) : Función Lógica que devuelve True, si el caracter ch, es una letra minúscula.
    letraMay(ch) : Función Lógica que devuelve True, si el caracter ch, es una latra mayúscula.
    letra(ch) :  Función Lógica que devuelve True, si el caracter ch, es una letra minúscula o mayúscula.
    digito(ch) : Función Lógica que devuelve True, si el caracter ch, es un dígito.
    letraDigito(ch) : Función Lógica que devuelve True, si el caracter ch, es una letra o dígito.
    puraLetras(s1) : Función lógica que devuelve True, si todos los caracteres de la cadena s1 son letras.
    puroDigitos(s1) : Función lógica que devuelve True, si todos los caracteres de la cadena s1 son dígitos.
    alfaNumerico(s1) : Función lógica que devuelve True, si los caracteres de la cadena s1 están formados por letras o dígitos.
    puraLetrasMay(s1) : Función lógica que devuelve True, si todos los caracteres de la cadena s1 son letras mayúsculas.
    puraLetrasMin(s1) : Función lógica que devuelve True, si todos los caracteres de la cadena s1 son letras minúsculas.
    canatidadLetras(s1) : Función que devuelve la cantidad de letras de la cadena s1.
    cantidadMay(s1) : Función que devuelve la cantidad de letras mayúsculas de la cadena s1.
    cantidadMin(s1) : Función que devuelve la cantidad de letras minúsculas de la cadena s1.
    cantidadDigitos(s1) : Función que devuelve la cantidad de de dígitos de la cadena s1.
    cantidadVocales(s1) : Función que devuelve la cantidad de vocales de la cadena s1.
    existeMayMin(s1) : Función lógica que devuelve True, si en la cadena s1 existe al menos una letra mayúscula y existe al menos una letra minúscula.
    panlindrome(s1) : Función lógica que devuelve True, si la cadena s1 es palíndrome.
*/

using namespace std;

int frecuencia(char s1[],char ch)
{
    int i=0;
    int c=0;
    while (i<strlen(s1))
    {
        if (s1[i]==ch) c=c+1;
        i=i+1;
    }
    return c;
}

int frecuenciaPuntero(char *p, char ch)
{
    int c=0;
    int i=0;
    while( i < strlen(p))
    {
        if (*(p+i)==ch) c=c+1;
        i=i+1;
    }
    return c;
}

int frecuenciaSumaVectQ(char *q,char ch)
{
    int c=0;
    while (*q)
    {
        if (*q ==ch) c=c+1;
        q=q+1;
    }
    return c;
}

//////////////////////////////////////////////////////////////////////////////
bool esVocal(char ch)
{
    char Vocal[] = "aeiouAEIOU";
    return strchr(Vocal,ch) !=0;
}

//////////////////////////////////////////////////////////////////////////////
//LABORATORIO 8


//1
bool letraMin(char ch)
{
    return ch>='a' && ch <='z';
}

//2
bool letraMay(char ch)
{
    return ch>='A' && ch <='Z';
}

//3
bool letra(char ch)
{
    return letraMay(ch) || letraMin(ch);
}

//4
bool digito(char ch)
{
    return ch>='0' && ch<='9';
}

//5
bool letraDigito(char ch)
{
    return letra(ch) || digito(ch);
}

//6
bool puroLetras(char S1[])
{
    int i=0;
    while (i<strlen(S1))
    {
        if (!letra(S1[i])) return false;
        i=i+1;
    }
    return true;
}

//7
bool puroDigitos(char S1[])
{
    int i=0;
    while (i<strlen(S1))
    {
        if (!digito(S1[i])) return false;
        i=i+1;
    }
    return true;
}

//8
bool alfanumerico(char S1[])
{
    int i=0;
    while (i<strlen(S1))
    {
        if (!digito(S1[i]) && !letra(S1[i])) return false;
        i=i+1;
    }
    return true;
}

//9
bool puraLetrasMay(char S1[])
{
    int i=0;
    while (i<strlen(S1))
    {
        if(!letraMay(S1[i]))return false;
        i=i+1;
    }
    return true;
}

//10
bool puraLetrasMin(char S1[])
{
    int i=0;
    while (i<strlen(S1))
    {
        if(!letraMin(S1[i]))return false;
        i=i+1;
    }
    return true;
}

//11
int cantidadLetras(char S1[])
{
    int i=0;
    int cant =0;
    while (i<strlen(S1))
    {
        if(letra(S1[i])) cant = cant+1;
        i=i+1;
    }
    return cant;
}

//12
int cantidadMay(char S1[])
{
    int i=0;
    int cant =0;
    while (i<strlen(S1))
    {
        if(letraMay(S1[i])) cant = cant+1;
        i=i+1;
    }
    return cant;
}

//13
int cantidadMin(char S1[])
{
    int i=0;
    int cant =0;
    while (i<strlen(S1))
    {
        if(letraMin(S1[i])) cant = cant+1;
        i=i+1;
    }
    return cant;
}

//14
int cantidadDigitos(char S1[])
{
    int i=0;
    int cant =0;
    while (i<strlen(S1))
    {
        if(digito(S1[i])) cant = cant+1;
        i=i+1;
    }
    return cant;
}

//15
int cantidadVocales(char S1[])
{
    int i=0;
    int cant =0;
    while (i<strlen(S1))
    {
        if(esVocal(S1[i])) cant = cant+1;
        i=i+1;
    }
    return cant;
}

//16
bool existeMayMin(char S1[])
{
    int i=0;
    int cant =0;
    while (i<strlen(S1))
    {
        if(letraMay(S1[i]) || letraMin(S1[i])) cant = cant+1;
        i=i+1;
    }
    return cant !=0 ;
}

//17
bool palindrome(char S1[])
{
    int i=0;
    int n = strlen(S1)-1;
    while (i<n)
    {
        if(S1[i] != S1[n-i]) return false;
        i=i+1;
    }
    return true;
}

int main()
{
    /*int a =4;
    int b =4;
    int *p = &a;
    int *q =&b;
    int c = *p+*q;      //contenido de P mas contenido de Q
    int *k = p+1;
    cout << k << "   " << &p << endl;
    */
    char S1[] = "";
    char CH1 = '!';
    int param;
    cout<< "Selecc. Funcion: "<<endl;
    cout<< "1. Char"<<endl;
    cout<< "2. String"<<endl;
    cout<< "Sel.:  ";
    cin>> param;
    if(param ==1)
    {
        cout<< "Inserte Carcter: ";
        cin>> CH1;
        cout<< "Su Caracter Es: " << CH1 << endl;
        cout<< "| Pruebas de Char |" <<endl;
        cout<< "LetraMin()   : " << letraMin(CH1) << endl;
        cout<< "LetraMay()   : " << letraMay(CH1) << endl;
        cout<< "letra()      : " << letra(CH1) << endl;
        cout<< "digito()     : " << digito(CH1) << endl;
        cout<< "LetraDigito(): " << letraDigito(CH1) << endl;
    }
    else if(param ==2)
    {
        cout<< "Inserte Cadena: ";
        cin>> S1;
        cout<< "Su Cadena Es: " << S1 <<endl;
        cout<< "| Pruebas de String |" <<endl;
        cout<< "puroLetras()      : " << puroLetras(S1) << endl;
        cout<< "puroDigitos()     : " << puroDigitos(S1) << endl;
        cout<< "alfanumerico()    : " << alfanumerico(S1) << endl;
        cout<< "puraLetrasMay()   : " << puraLetrasMay(S1) << endl;
        cout<< "puraLetrasMin()   : " << puraLetrasMin(S1) << endl;
        cout<< "cantidadLetras()  : " << cantidadLetras(S1) << endl;
        cout<< "cantidadMay()     : " << cantidadMay(S1) << endl;
        cout<< "cantidadMin()     : " << cantidadMin(S1) << endl;
        cout<< "cantidadDigitos() : " << cantidadDigitos(S1) << endl;
        cout<< "cantidadVocales() : " << cantidadVocales(S1) << endl;
        cout<< "existeMayMin()    : " << existeMayMin(S1) << endl;
        cout<< "palindrome()      : " << palindrome(S1) << endl;
    }
    else return 0;
    return 0;
}
