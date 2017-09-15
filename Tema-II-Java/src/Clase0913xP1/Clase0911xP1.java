// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0913xP1;

public class Clase0911xP1
{

    public static void main(String[] args)
    {
        int a[] =
        {
            1, 2, 3, 4, 5
        };
        System.out.println(ordenDesc(a));
    }

    //1
    public static int suma(int a[])
    {
        int sum = 0;
        int i = 0;
        while (i < a.length)
        {
            sum = sum + a[i];
            i = i + 1;
        }
        return sum;
    }

    //2
    public static int menor(int a[])
    {
        int me = a[0];
        int i = 0;
        while (i < a.length)
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
    public static int mayor(int a[])
    {
        int me = a[0];
        int i = 0;
        while (i < a.length)
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
    public static int frecuencia(int a[], int x)
    {
        int tot = 0;
        int i = 0;
        while (i < a.length)
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
    public static boolean iguales(int a[])
    {
        int cp = a[0];
        int i = 0;
        while (i < a.length)
        {
            if (a[i] != cp)
            {
                return false;
            }
        }
        return true;
    }

    //6
    public static boolean ordenado(int a[])
    {
        return ordenAsc(a) || ordenDesc(a);
    }

    //7
    public static boolean diferentes(int a[])
    {
        int i = 0;
        while (i < a.length - 1)
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
    public static int cantidadPares(int a[])
    {
        int tot = 0;
        int i = 0;
        while (i < a.length)
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
    public static int sumaImpares(int a[])
    {
        int tot = 0;
        int i = 0;
        while (i < a.length)
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
    public static boolean puroPares(int a[])
    {
        int i = 0;
        while (i < a.length)
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
    public static boolean existeParImpar(int a[])
    {
        return cantidadPares(a) != 0 && sumaImpares(a) != 0;
    }

    //12
    public static boolean palindrome(int a[])
    {
        int i = 0;
        while (i < a.length)
        {
            if (a[i] != a[a.length - i])
            {
                return false;
            }
        }
        return true;
    }
    //////////////////////////////////////////////////////////////////////////

    public static boolean ordenAsc(int a[])
    {
        int i = 0;
        while (i < a.length - 1)
        {
            if (a[i] > a[i + 1])
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    public static boolean ordenDesc(int a[])
    {
        int i = 0;
        while (i < a.length - 1)
        {
            if (a[i] < a[i + 1])
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

}
