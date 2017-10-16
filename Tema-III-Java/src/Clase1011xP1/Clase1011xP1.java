// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1011xP1;

import java.util.*;

public class Clase1011xP1
{

    public static void main(String[] args)
    {
        ArrayList<Integer> L1 = new ArrayList();

        L1.add(8);
        L1.add(2);
        L1.add(9);

        System.out.println(L1);
        System.out.println(suma(L1));
        System.out.println(iguales(L1));
        System.out.println(diferentes(L1));
        System.out.println(existeImpar(L1));
    }

    //1
    public static int frecuencia(ArrayList<Integer> L1, int x)
    {
        int i = 0;
        int frec = 0;
        while (i < L1.size())
        {
            if (L1.get(i) == x)
            {
                frec = frec + 1;
            }
            i = i + 1;
        }
        return frec;
    }

    //2
    public static boolean iguales(ArrayList<Integer> L1)
    {
        return frecuencia(L1, L1.get(0)) == L1.size();
    }

    //3
    public static boolean diferentes(ArrayList<Integer> L1)
    {
        int i = 0;
        while (i < L1.size())
        {
            if (frecuencia(L1, L1.get(i)) != 1)
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //4
    public static int mayor(ArrayList<Integer> L1)
    {
        int i = 0;
        int mayor = L1.get(0);
        while (i < L1.size())
        {
            if (L1.get(i) > mayor)
            {
                mayor = L1.get(i);
            }
            i = i + 1;
        }
        return mayor;
    }

    //5
    public static int menor(ArrayList<Integer> L1)
    {
        int i = 0;
        int menor = L1.get(0);
        while (i < L1.size())
        {
            if (L1.get(i) < menor)
            {
                menor = L1.get(i);
            }
            i = i + 1;
        }
        return menor;
    }

    //6
    public static boolean ordenado(ArrayList<Integer> L1)
    {
        return ordenAsc(L1) || ordenDesc(L1);
    }

    //7
    public static int cantidadPares(ArrayList<Integer> L1)
    {
        int i = 0;
        int frec = 0;
        while (i < L1.size())
        {
            if (L1.get(i) % 2 == 0)
            {
                frec = frec + 1;
            }
            i = i + 1;
        }
        return frec;
    }

    //8
    public static boolean seEncuentra(ArrayList<Integer> L1, int x)
    {
        return L1.contains(x);
    }

    //9
    public static boolean existeFrec(ArrayList<Integer> L1, int k)
    {
        int i = 0;
        while (i < L1.size())
        {
            if (frecuencia(L1, L1.get(i)) == k)
            {
                return true;
            }
            i = i + 1;
        }
        return false;
    }

    //10
    public static boolean mismaFrec(ArrayList<Integer> L1)
    {
        int i = 0;
        int cmp = frecuencia(L1, L1.get(0));
        while (i < L1.size())
        {
            if (frecuencia(L1, L1.get(i)) != cmp)
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //12
    public static boolean existePar(ArrayList<Integer> L1)
    {
        return cantidadPares(L1) >= 1;
    }

    //13
    public static boolean existeImpar(ArrayList<Integer> L1)
    {
        return cantidadPares(L1) < L1.size();
    }

    //14
    public static boolean todoPares(ArrayList<Integer> L1)
    {
        return cantidadPares(L1) == L1.size();
    }

    //15
    public static boolean todoImpares(ArrayList<Integer> L1)
    {
        int i = 0;
        while (i < L1.size())
        {
            if (L1.get(i) % 2 != 0)
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //16
    public static boolean existeParImpar(ArrayList<Integer> L1)
    {
        return existePar(L1) || existeImpar(L1);
    }

    //17
    public static boolean palindrome(ArrayList<Integer> L1)
    {
        int i = 0;
        while (i < L1.size())
        {
            if (L1.get(i) != L1.get(L1.size() - 1 - i))
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //19
    public static int suma(ArrayList<Integer> L1)
    {
        int sum = 0;
        int i = 0;
        while (i < L1.size())
        {
            sum = sum + L1.get(i);
            i = i + 1;
        }
        return sum;
    }

    //20
    public static double promedio(ArrayList<Integer> L1)
    {
        return suma(L1) / L1.size();
    }

    /////////////////////////////////////////////////////////////////////////
    public static boolean ordenAsc(ArrayList<Integer> L1)
    {
        for (int i1 = 0; i1 < L1.size() - 1; i1++)
        {
            if (L1.get(i1) > L1.get(i1 + 1))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean ordenDesc(ArrayList<Integer> L1)
    {
        for (int i1 = 0; i1 < L1.size() - 1; i1++)
        {
            if (L1.get(i1) < L1.get(i1 + 1))
            {
                return false;
            }
        }
        return true;
    }

}
