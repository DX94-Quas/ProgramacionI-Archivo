// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase3107xP1;

import java.util.StringTokenizer;
import static Tarea1.Tarea1.ordenado;
import static Tarea1.Tarea1.cadenaInvertida;
import static Tarea1.Tarea1.isVocal;

public class Laboratorio5
{

    public static void main(String[] args)
    {
        //2
        mostrarPalabras("abc abc abcc abbcc abc abcc", 3);
        //3
        mostrarPalabrasOrden("abc 123 456 654 eka 968");
        //8
        System.out.println(invertirPalabras("hay que volcar esta oracion"));
        //9
        System.out.println(PalabrasOrd("abc 123 456 654"));
        //6
        iniciales("El Coco se ha caido");
        //10
        System.out.println(seEncuentra("oso","el oso se durmio"));
        //12
        System.out.println(frecuenciaPal("abc def abc abc abc","abc"));
        //4
        mostrarPalabrasVocal("abaco lotto alto marea");
        //17
        System.out.println(extremosIguales("abaco abaco"));
        //11
        System.out.println(mismasPalabras("hay papas", "papas hay"));
        //7
        System.out.println(invertirSecPalabras("el gato se cayo"));
        //16
        System.out.println(ultimaPalabra("el payaso se murio"));
        //13
        System.out.println(excluyentes("nada que ver","el gato"));
        //5
        System.out.println(darFormato("eL cOcO"));
        //14
        System.out.println(conFormato("el Coco"));
    }

    ///////////////////////////////////////////////////////////////////////////
    //1
    public static void mostrarPalabras(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            System.out.println(token);
        }
    }

    //2
    public static void mostrarPalabras(String S1, int k)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (token.length() == k)
            {
                System.out.println(token);
            }
        }
    }

    //3
    public static void mostrarPalabrasOrden(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (ordenado(token) == true)
            {
                System.out.println(token);
            }
        }
    }

    //4
    public static void mostrarPalabrasVocal(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (isVocal(token.charAt(0)) == true)
            {
                System.out.println(token);
            }
        }
    }

    //5
    public static String darFormato(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        String SR = "";
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            String tokenc = "";
            for (int i = 0; i < token.length(); i++)
            {
                if (i == 0)
                {
                    tokenc = tokenc + Character.toUpperCase(token.charAt(i));
                }
                else
                {
                    tokenc = tokenc + Character.toLowerCase(token.charAt(i));
                }
            }
            SR = SR + " " + tokenc;
        }
        SR = SR.substring(1);
        return SR;
    }

    //6
    public static void iniciales(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (Character.isUpperCase(token.charAt(0)) == true)
            {
                System.out.println(token.charAt(0));
            }
        }
    }

    //7
    public static String invertirSecPalabras(String S1)
    {
        String SK = cadenaInvertida(S1);
        StringTokenizer st = new StringTokenizer(SK, "(),; .");
        String SR = "";
        while (st.hasMoreTokens())
        {
            String token = cadenaInvertida(st.nextToken());
            SR = SR + " " + token;
        }
        SR = SR.substring(1);
        return SR;
    }

    //8
    public static String invertirPalabras(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        String SR = "";
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            SR = SR + " " + cadenaInvertida(token);
        }
        SR = SR.substring(1);
        return SR;
    }

    //9
    public static boolean PalabrasOrd(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (ordenado(token) == false)
            {
                return false;
            }
        }
        return true;
    }

    //10
    public static boolean seEncuentra(String S2, String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (token.equals(S2))
            {
                return true;
            }
        }
        return false;
    }

    //11
    public static boolean mismasPalabras(String S1, String S2)
    {
        StringTokenizer st = new StringTokenizer(S2, "(),; .");
        String token;
        while (st.hasMoreTokens())
        {
            token = st.nextToken();
            if (S1.indexOf(token) == -1)
            {
                return false;
            }
        }
        return true;
    }

    //12
    public static int frecuenciaPal(String S1, String S2)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        int t = 0;
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (token.equals(S2))
            {
                t = t + 1;
            }
        }
        return t;
    }

    //13
    public static boolean excluyentes(String S1, String S2)
    {
        StringTokenizer st = new StringTokenizer(S2, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (S1.contains(token) == true)
            {
                return false;
            }
        }
        return true;
    }

    //14
    public static boolean conFormato(String S1)
    {
        return S1.equals(darFormato(S1));
    }

    //15
    public static boolean palabrasIguales(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        String palabra = st.nextToken();
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (!palabra.equals(token))
            {
                return false;
            }
        }
        return true;
    }

    //16
    public static String ultimaPalabra(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        String token = "";
        while (st.hasMoreTokens())
        {
            token = st.nextToken();
        }
        return token;
    }

    //17
    public static boolean extremosIguales(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        String palabra = st.nextToken();
        String token = "";
        while (st.hasMoreTokens())
        {
            token = st.nextToken();
        }
        return token.equals(palabra);
    }
}
