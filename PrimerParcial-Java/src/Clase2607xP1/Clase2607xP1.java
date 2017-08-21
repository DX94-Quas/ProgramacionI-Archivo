// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase2607xP1;

import static Tarea1.Tarea1.charIguales;

public class Clase2607xP1 
{
    public static void main(String[] args)
    {
        mostrarIgualesMod("123334566678999");
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void mostrarIgualesMod(String S1)
    {
        String S2;
        for (int i =0 ; i < S1.length() ; i++) 
        {
            for (int j = i+1 ; j <= S1.length() ; j++)
            {
                S2 = S1.substring(i,j);
                if (charIguales(S2) == true) System.out.println(S2);
            }
        }
    }
    public static void mostrarPalindromesMod(String S1)
    {
        String S2;
        for (int i =0 ; i < S1.length() ; i++)
       
        {
            for (int j = i+1 ; j <= S1.length() ; j++)
            {
                S2 = S1.substring(i,j);
                if (palindromeMod(S2) == true) System.out.println(S2);
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    // Librerias Meme
    public static boolean palindromeMod(String S1)
    {
        for (int i=0, j = S1.length() -1 ; i<j ; i++, j-- )
        {
            if (S1.charAt(i) != S1.charAt(j)) return false;
        }
        return true;
    }
            
}
