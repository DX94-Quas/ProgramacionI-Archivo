// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase2407xP1;

import static Tarea1.Tarea1.charIguales;
import static Tarea1.Tarea1.puroLetras;
import static Tarea1.Tarea1.alfaNumerico;
import static Tarea1.Tarea1.sinVocales;
import static Tarea1.Tarea1.charDiferentes;

public class Laboratorio4 
{
    public static void main(String[] args)
    {
        mostrarLongitud("123334566678999",5);
        mostrarIguales("123334566678999");         
        mostrarPalindromes("123334madam5666racecar78999");
        mostrarLetras("123334madam5666racecar78999");
        mostrarLetrasDigitos("1///2333+++4madam56...66ra   cecar###78999");
        mostrarSinVocales("123334madam5666racecar###78999");
    }
    ////////////////////////////////////////////////////////////////////////////
    // Lab 4
    public static void mostrarLongitud(String S1, int k)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (S2.length() == k) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    public static void mostrarIguales(String S1)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (charIguales(S2) == true) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    public static void mostrarPalindromes(String S1)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (palindrome(S2) == true) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    public static void mostrarLetras(String S1)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (puroLetras(S2) == true) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    public static void mostrarLetrasDigitos(String S1)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (alfaNumerico(S2) == true) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    public static void mostrarSinVocales(String S1)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (sinVocales(S2) == true) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    public static void mostrarDiferentes(String S1)
    {
        int i =0;
        String S2;
        while (i < S1.length())
       
        {
            int j =i+1;
            while (j<=S1.length())
            {
                S2 = S1.substring(i,j);
                if (charDiferentes(S2) == true) System.out.println(S2);
                j++;
            }
            i++;
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    // Librerias Verga
    public static boolean palindrome (String S1)
    {
        int i =0;
        int n = S1.length()-1;
        while (i < n)
        {
            if(S1.charAt(i)!=S1.charAt(n-i)) return false;
            i++;
        }
        return true;
    }
}
