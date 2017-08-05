// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase3107xP1;

import java.util.StringTokenizer;

public class Clase3107 
{
    public static void main(String[] args)
    {
        mostrarTokens("for(int i = 0 ; j = S1.length() ; i < j ;i++ , j--)");
        System.out.println(palabrasIguales("ab ab ab ab"));
        System.out.println(palabrasAscendentes("abe abc"));
    }
    ///////////////////////////////////////////////////////////////////////////
    //
    public static void mostrarTokens(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1,"(),; .");
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
    //
    public static boolean palabrasIguales(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1,"(),; .");
        String palabra = st.nextToken();
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            if(!palabra.equals(token)) return false;
        }
        return true;
    }
    //
    public static boolean palabrasAscendentes(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1,"(),; .");
        String palabraAnt = st.nextToken();
        while(st.hasMoreTokens())
        {
            String pal = st.nextToken();
            if(palabraAnt.compareTo(pal) > 0) return false;
            palabraAnt = pal;
        }
        return true;
    }
}
