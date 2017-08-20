// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package PrimerExamen;

import static Tarea1.Tarea1.cadenaInvertida;
import static Tarea1.Tarea1.ordenAsc;
import static Tarea1.Tarea1.isVocal;
import static Clase2407xP1.Laboratorio4.palindrome;
import java.util.StringTokenizer;

public class Examen1
{

    public static void main(String[] args)
    {
        //
        System.out.println(generarCadena('*', 5));
        //
        System.out.println(generarCapicua("abc"));
        //
        System.out.println(valorFrase("xyz"));
        //
        System.out.println(concatenarOrden("xyz", "abc"));
        //
        System.out.println(dentroCadena( "abc", "123abc456"));
        //
        mostrarAsc("pa123ro987me");
        //
        mostrarSub("palindrome");
        //
        mostrarChar("palindrome", 'i');
        //
        mostrarPalindromes("racecar vagancia madam");
        //
        mostrarPalabrasAsc("cba abc 123 456 987");
        //
        System.out.println(cantVocal("aeiou"));
        //
        mostrarPalabrasVocal("aa ee ii oo uu enam vago oo nhay", 2);
    }

    //////////////////////////////////////////////////////////////////////////
    //1
    public static String generarCadena(char CH, int n)
    {
        int i = 0;
        String S2 = "";
        while (i < n)
        {
            S2 = S2 + CH;
            i++;
        }
        return S2;
    }

    //2
    public static String generarCapicua(String S1)
    {
        String Derecho = S1;
        String Reves = cadenaInvertida(S1);
        return Derecho + Reves;
    }

    //3
    public static String concatenarOrden(String S1, String S2)
    {
//        int k1 = valorFrase(S1);
//        int k2 = valorFrase(S2);
        String res = "";
//        if (k2 > k1)
//        {
//            res = S1 + S2;
//        }
//        else
//        {
//            res = S2 + S1;
//        }
//        return res;
        if (S1.compareTo(S2) == -1)
            return S1 + S2;
        else
            return S2 + S1;
    }

    //4
    public static boolean dentroCadena(String S1, String S2)
    {
//        int a = S1.indexOf(S2);
//        int b = S1.lastIndexOf(S2) + S2.length();
//        int c = S2.indexOf(S1);
//        int d = S2.lastIndexOf(S1) + S2.length();
//        int f1 = 0;
//        int f2 = 0;
//
//        if (a != 0 && b != S1.length() - 1)
//        {
//            f1 = 1;
//        }
//        if (c != 0 && d != S1.length() - 1)
//        {
//            f2 = 1;
//        }
//        System.out.println(f1);
//        System.out.println(f2);
        if (S1.startsWith(S2) || S1.endsWith(S2)) return false;
        if (S2.startsWith(S1) || S2.endsWith(S1)) return false;
        return true;
//        return f1 > 0 && f2 > 0;
    }

    //5
    public static void mostrarAsc(String S1)
    {
        int i = 0;
        String S2;
        while (i < S1.length())
        {
            int j = i + 1;
            while (j <= S1.length())
            {
                S2 = S1.substring(i, j);
                if (ordenAsc(S2) == true)
                {
                    System.out.println(S2);
                }
                j++;
            }
            i++;
        }
    }

    //6
    public static void mostrarSub(String S1)
    {
        int i = 0;
        String S3;
        while (i < S1.length())
        {
            int j = i + 1;
            while (j <= S1.length())
            {
                S3 = S1.substring(i, j);
                System.out.println(S3);
                j++;
            }
            i++;
        }
    }

    //7
    public static void mostrarChar(String S1, char ch)
    {
        int i = 0;
        String S2;
        while (i < S1.length())
        {
            int j = i + 1;
            while (j <= S1.length())
            {
                S2 = S1.substring(i, j);
                if (S2.indexOf(ch) != -1)
                {
                    System.out.println(S2);
                }
                j++;
            }
            i++;
        }
    }

    //8
    public static void mostrarPalabrasVocal(String S1, int k)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (cantVocal(token) == k)
            {
                System.out.println(token);
            }
        }
    }

    //9
    public static void mostrarPalabrasAsc(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (ordenAsc(token) == true)
            {
                System.out.println(token);
            }
        }
    }

    //10
    public static void mostrarPalindromes(String S1)
    {
        StringTokenizer st = new StringTokenizer(S1, "(),; .");
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            if (palindrome(token) == true)
            {
                System.out.println(token);
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    public static int valorFrase(String S1)
    {
        int i = 0;
        int k = S1.length();
        int value = 0;
        while (i < k)
        {
            value = value + Character.getNumericValue(S1.charAt(i));
            i = i + 1;
        }
        return value;
    }

    public static int cantVocal(String S1)
    {
        int k1 = S1.length();
        int voc = 0;
        int i = 0;
        while (i < k1)
        {
            if (isVocal(S1.charAt(i)) == true)
            {
                voc = voc + 1;
            }
            i = i + 1;
        }
        return voc;
    }
}
