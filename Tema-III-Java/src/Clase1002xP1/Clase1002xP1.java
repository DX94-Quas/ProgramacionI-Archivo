// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1002xP1;

public class Clase1002xP1
{

    public static void main(String[] args)
    {
        Lista01 L1 = new Lista01();
        L1.insertarUlt(50);
        L1.insertarUlt(23);
        L1.insertarUlt(42);
        L1.insertarUlt(85);
        L1.insertarUlt(12);
        L1.insertarUlt(8);
//        System.out.println(L1);
//        L1.ordenarSeleccionAsc();
//        System.out.println(L1);
//        L1.ordenarInsercionAsc();
//        System.out.println(L1);
//        
//        L1.ordenarSeleccionDesc();
//        System.out.println(L1);
//        L1.ordenarInsercionDesc();
//        System.out.println(L1);

        L1.bubble_srt_desc();
        System.out.println(L1);

        ///////////////////////////////////////////////////////////////////////
//        int a[] =
//        {
//            50, 23, 69, 19, 96, 66, 42
//        };
//        ordenarSeleccionAsc(a);
//        System.out.println(toString(a));
//        ordenarInsercionAsc(a);
//        System.out.println(toString(a));
//        
//        ordenarSeleccionDesc(a);
//        System.out.println(toString(a));
//        ordenarInsercionDesc(a);
//        System.out.println(toString(a));
    }

    //5
    public static void ordenarSeleccionAsc(int a[])
    {
        // Seleccion Directa
        int i = 0;
        while (i < a.length)
        {
            int men = a[i];
            int k = i;
            int j = i;
            while (j < a.length)
            {
                if (a[j] < men)
                {
                    men = a[j];
                    k = j;
                }
                j = j + 1;
            }
            intercambiar(a, i, k);
            i = i + 1;
        }
    }

    //6
    public static void ordenarSeleccionDesc(int a[])
    {
        // Seleccion Directa
        int i = 0;
        while (i < a.length)
        {
            int men = a[i];
            int k = i;
            int j = i;
            while (j < a.length)
            {
                if (a[j] > men)
                {
                    men = a[j];
                    k = j;
                }
                j = j + 1;
            }
            intercambiar(a, i, k);
            i = i + 1;
        }
    }

    //7
    public static void ordenarInsercionAsc(int a[])
    {
        int i = 1;
        while (i < a.length)
        {
            int j = i - 1;
            int x = a[i];
            while (j >= 0 && a[j] > x)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = x;
            i = i + 1;
        }
    }

    //8
    public static void ordenarInsercionDesc(int a[])
    {
        int i = 1;
        while (i < a.length)
        {
            int j = i - 1;
            int x = a[i];
            while (j >= 0 && a[j] < x)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = x;
            i = i + 1;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    public static String toString(int a[])
    {
        String res = "";
        int i = 0;
        while (i < a.length)
        {
            if (i == 0)
            {
                res = "[ " + a[i] + ", ";
            }
            else if (i == a.length - 1)
            {
                res = res + a[i] + " ]";
            }
            else
            {
                res = res + a[i] + ", ";
            }
            i = i + 1;
        }
        return res;
    }

    public static void intercambiar(int a[], int i, int j)
    {
        int avx = a[i];
        a[i] = a[j];
        a[j] = avx;
    }
}
