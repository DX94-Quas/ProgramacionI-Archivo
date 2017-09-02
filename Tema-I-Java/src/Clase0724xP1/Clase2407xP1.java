// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase0724xP1;

public class Clase2407xP1 
{
    public static void main(String[] args)
    {
        mostrarSubcadenas("01234567");
    }
    public static void mostrarSubcadenas(String S1)
    {
        int i =0;
        while (i < S1.length())
        {
            int j =i+1;
            while (j<=S1.length())
            {
                System.out.println(S1.substring(i,j));
                j++;
            }
            i++;
        }
    }
    
}
