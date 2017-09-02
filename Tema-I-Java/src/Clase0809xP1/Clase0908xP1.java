// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0809xP1;

import java.util.StringTokenizer;

public class Clase0908xP1
{

    public static void main(String[] args)
    {
        System.out.println(darFormato("juan    perez"));
    }

    ///////////////////////////////////////////////////////////////////////////
    //5
    public static String darFormato(String S1)
    {
        String S2 = S1.toLowerCase();
        StringTokenizer st = new StringTokenizer(S2);
        String S3 = "";
        while (st.hasMoreTokens())
        {
            String pal = st.nextToken();
            S3 = S3 + capital(pal) + " ";
        }
        return S3;
    }
    //
    
    
    ///////////////////////////////////////////////////////////////////////////
    // librerias meme
    public static String capital(String S1)
    {
        return Character.toUpperCase(S1.charAt(0))
                + S1.substring(1);
    }
    //
    public static boolean verif(String S1)
    {
        if (!Character.isUpperCase(S1.charAt(0)))  return false;
        int i =1;
        while (i<S1.length())
        {
            if(!Character.isLowerCase(S1.charAt(i))) return false;
        }
        i = i+1;
        return true;
    }
    
}
