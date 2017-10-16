// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1016xP1;

import java.util.*;

public class Clase1016xP1
{

    public static void main(String[] args)
    {
        ArrayList<Racional> L1 = new ArrayList();

        L1.add(new Racional(1, 3));
        L1.add(new Racional(16, 5));
        L1.add(new Racional(48, 9));
        //multiplicarRacional(L1,new Racional(5,1));
        System.out.println(multiplicacRacionales(L1));

    }

    //1
    public static Racional menorRacional(ArrayList<Racional> L1)
    {
        Racional men = L1.get(0);
        int i = 0;
        while (i < L1.size())
        {
            if (L1.get(i).menor(men))
            {
                men = L1.get(i);
            }
            i = i + 1;
        }
        return men;
    }

    //2
    public static Racional mayorRacional(ArrayList<Racional> L1)
    {
        Racional may = L1.get(0);
        int i = 0;
        while (i < L1.size())
        {
            if (L1.get(i).mayor(may))
            {
                may = L1.get(i);
            }
            i = i + 1;
        }
        return may;
    }

    //3
    public static boolean iguales(ArrayList<Racional> L1)
    {
        int i = 0;
        while (i < L1.size())
        {
            if (L1.get(i) != L1.get(i + 1))
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //4
    public static boolean ordenAsc(ArrayList<Racional> L1)
    {
        int i = 0;
        while (i < L1.size() - 1)
        {
            if (L1.get(i).mayor(L1.get(i + 1)))
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //5
    public static void multiplicarRacional(ArrayList<Racional> L1, Racional R1)
    {
        int i = 0;
        while (i < L1.size())
        {
            L1.set(i, L1.get(i).multiplicar(L1.get(i), R1));
            i = i + 1;
        }
    }

    //6
    public static void reciprocoRacionales(ArrayList<Racional> L1)
    {
        int i = 0;
        while (i < L1.size())
        {
            L1.set(i, L1.get(i).reciproco());
            i = i + 1;
        }
    }

    //7
    public static Racional sumaRacionales(ArrayList<Racional> L1)
    {
        Racional sum = L1.get(0);
        int i = 1;
        while (i < L1.size())
        {
            sum=sum.sumarRac(sum, L1.get(i));
            i = i + 1;
        }
        return sum;
    }

    //8
    public static Racional multiplicacRacionales(ArrayList<Racional> L1)
    {
        Racional mult = L1.get(0);
        int i = 1;
        while (i < L1.size())
        {
            mult = mult.multiplicar(mult, L1.get(i));
            i = i + 1;
        }
        return mult;
    }
}
