// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package CuartoExamen;

import java.util.*;

public class ListaArrgl 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> L1 = new ArrayList();
        L1.add(1);
        L1.add(1);
        L1.add(1);
        L1.add(1);
        L1.add(1);
        
        System.out.println(suma(L1));
        

    }
    
    public static int menor(ArrayList<Integer> L1)
    {
        int i=0,menor = L1.get(0);
        while(i<L1.size())
        {
            if(L1.get(i)<menor) menor = L1.get(i);
            i++;
        }
        return menor;
    }
    
    public static int suma(ArrayList<Integer> L1)
    {
        int i=0, sum=0;
        while(i<L1.size())
        {
            sum = sum+L1.get(i);
            i++;
        }
        return sum;
    }
    
    public static boolean iguales(ArrayList<Integer> L1)
    {
        int i=0;
        while(i<L1.size())
        {
            if(L1.get(i) != L1.get(0)) return false;
            i++;
        }
        return true;
    }
    
    public static boolean pares(ArrayList<Integer> L1)
    {
        int i=0;
        while(i<L1.size())
        {
            if(L1.get(i)%2 !=0) return false;
            i++;
        }
        return true;
    }
    
    public static void reempl(ArrayList<Integer> L1, int x, int y)
    {
                int i=0;
        while(i<L1.size())
        {
            if(L1.get(i) == x) L1.set(i, y);
            i++;
        }
    }
}
