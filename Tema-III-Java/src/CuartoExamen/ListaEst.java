// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package CuartoExamen;

public class ListaEst
{

    public static void main(String[] args)
    {
        int a[] =
        {
            2, 2, 2, 2, 3
        };

        //reeempl(a,3,100);
        System.out.println(iguales(a));
    }

    public static int tam(int a[])
    {
        return a.length;
    }

    public static int menor(int a[])
    {
        int i = 0, menor = a[0];
        while (i < tam(a))
        {
            if (a[i] < menor)
            {
                menor = a[i];
            }
            i++;
        }
        return menor;
    }

    public static int suma(int a[])
    {
        int i = 0, sum = 0;
        while (i < tam(a))
        {
            sum = sum + a[i];
            i = i + 1;
        }
        return sum;
    }

    public static boolean iguales(int a[])
    {
        int i = 0;
        while (i < tam(a))
        {
            if (a[i] != a[0])
            {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean todoPares(int a[])
    {
        int i = 0;
        while (i < tam(a))
        {
            if (a[i] % 2 != 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void reeempl(int a[], int x, int y)
    {
        int i = 0;
        while (i < tam(a))
        {
            if (a[i] == x)
            {
                a[i] = y;
            }
            i++;
        }
    }

}
