// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase2207xP2;

public class Clase2207xP2 
{
    public static void main(String[] args) 
    {
        //Caracteres
        System.out.println(puraLetras("abcdef"));
        System.out.println(puraLetras("abc88def"));
        //Letras
        
    }
    //Caracteres
    public static boolean puraLetras(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isLetter(S1.charAt(i))) return false;
            i=i+1;
        }
        return true;
    }
    
    /// Cadenas
    public static boolean isVocal (char ch)
    {
        return "AEIOUaeiou".indexOf(ch) >= 0;
    }
    public static int cantidad(String S1, String S2)
    {
        int k = S1.indexOf(S2), c = 0;
        while ( k >=0 )
        {
            c = c + 1;
            k = S1.indexOf(S2, k + 1);
        }
        return c;
    }
    
}
