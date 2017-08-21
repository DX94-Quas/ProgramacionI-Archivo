// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0208xP1;

import static Tarea1.Tarea1.isVocal;
import static Tarea1.Tarea1.digito;

public class Clase0208xP1
{

    public static void main(String[] args)
    {
        //1
        System.out.println(vocalesJuntas("sdfehaa"));
        //38
        System.out.println(soloVocales("sdfehaa"));
        //39
        System.out.println(sinVocales("sdfehaa"));
        //3
        System.out.println(cadenaInvertida("sdfehaa"));
        //6
        System.out.println(sumaDigitos("sdf38ehaa1"));
    }

    ///////////////////////////////////////////////////////////////////////////
    //1
    public static boolean vocalesJuntas(String S1)
    {
        int i = 0;
        while (i < S1.length() - 1)
        {
            if (isVocal(S1.charAt(i)) && isVocal(S1.charAt(i + 1)))
            {
                return true;
            }
            i = i + 1;
        }
        return false;
    }

    //3
    public static String cadenaInvertida(String S1)
    {
        int i = 0;
        String S2 = "";
        while (i < S1.length())
        {
            S2 = S1.charAt(i) + S2;
            i++;
        }
        return S2;
    }

    //6
    public static int sumaDigitos(String S1)
    {
        int i = 0;
        int suma = 0;
        while (i < S1.length())
        {
            suma = suma + digito(S1.charAt(i));
            i++;
        }
        return suma;
    }

    //13
    public static boolean diaSemana(String S1)
    {
        String S2 = S1.toLowerCase();
        return S2.contains("lunes")
                || S2.contains("martes")
                || S2.contains("miercoles")
                || S2.contains("jueves")
                || S2.contains("viernes")
                || S2.contains("sabado")
                || S2.contains("domingo");
    }

    //38
    public static String soloVocales(String S1)
    {
        String S2 = "";
        int i = 0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)))
            {
                S2 = S2 + S1.charAt(i);
            }
            i = i + 1;
        }
        return S2;
    }

    //39
    public static String sinVocales(String S1)
    {
        String S2 = "";
        int i = 0;
        while (i < S1.length())
        {
            if (!isVocal(S1.charAt(i)))
            {
                S2 = S2 + S1.charAt(i);
            }
            i = i + 1;
        }
        return S2;
    }

}
