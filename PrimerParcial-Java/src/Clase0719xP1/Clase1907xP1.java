// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase0719xP1;

public class Clase1907xP1 
{
    public static void main(String[] args) 
    {
        System.out.println("(EJ)Es Vocal:");
        System.out.println(esvocal('H'));
        System.out.println("(EJ)Cantidad:");
        System.out.println(cantidad("abcXYZpqrXYZabc","XYZ"));
    }
    public static boolean esvocal(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)>=0;
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
