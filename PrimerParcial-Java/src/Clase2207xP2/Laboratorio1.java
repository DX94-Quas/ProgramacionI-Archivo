// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Clase2207xP2;

public class Laboratorio1 {
    
    public static void main(String[] args)
    {
        // LABORATORIO 1
        System.out.println(soloLetrasMay("ABCD"));
        System.out.println(soloLetrasMin("ABCD"));
        System.out.println(cantLetras("3333++++ABCDefgh"));
        System.out.println(cantDigitos("3333++++A777BCDefgh"));
        System.out.println(puroDigitos("5684849"));
        System.out.println(alfaNumerico("5684++"));
        System.out.println(generarCad("abc",5));
        System.out.println(palindrome("madam"));
        System.out.println(extraerDigito("madam777888"));
        System.out.println(intercalarChar("abc","123"));
        System.out.println(separarCharConString("abc","123"));
        // LABORATORIO 1 - Docente
        System.out.println(intercalarCharDoc("abdvcgvc","1234"));
    }
    ////////////////////////////////////////////////////////////////////////////
    // LABORATORIO 1
    public static boolean soloLetrasMay(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isUpperCase(S1.charAt(i))) return false;
            i=i+1;
        }
        return true;
    }
    public static boolean soloLetrasMin(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isLowerCase(S1.charAt(i))) return false;
            i=i+1;
        }
        return true;
    }
    public static int cantLetras(String S1)
    {
        int i = 0;
        int k =0;
        while (i < S1.length())
        {
            if (Character.isLetter(S1.charAt(i))) k=k+1;
            i++;
        }
        return k;
    }
    public static int cantDigitos(String S1)
    {
        int i = 0;
        int k =0;
        while (i < S1.length())
        {
            if (Character.isDigit(S1.charAt(i))) k=k+1;
            i++;
        }
        return k;
    }
    public static boolean puroDigitos(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isDigit(S1.charAt(i))) return false;
            i=i+1;
        }
        return true;
    }
    public static boolean alfaNumerico(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isLetterOrDigit(S1.charAt(i))) return false;
            i=i+1;
        }
        return true;
    }
    public static String generarCad(String S1, int n)
    {
        int i=0;
        String S2 = "";
        while (i<n)
        {
            S2 = S2.concat(S1);
            i++;
        }
        return S2;
    }
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
    public static String extraerLetra(String S1)
    {
        int i=0;
        String S2="";
        while(i<S1.length())
        {
            if (Character.isLetter(S1.charAt(i))) S2=S2+S1.charAt(i);
            i++;
        }
        return S2; 
    }
    public static String extraerDigito(String S1)
    {
        int i=0;
        String S2="";
        while(i<S1.length())
        {
            if (Character.isDigit(S1.charAt(i))) S2=S2+S1.charAt(i);
            i++;
        }
        return S2; 
    }
    public static String intercalarChar(String S1, String S2)
    {
        String S3 = "";
        int a = S1.length();
        int b = S2.length();
        int i =0;
        int j =0;
        while (i < a || j<b)
        {
            S3 = S3 + S1.charAt(i) + S2.charAt(j);
            i++;
            j++;     
        }
        return S3;        
    }
    public static String separarCharConString(String S1, String S2)
    {
        String S3 = "";
        int a = S1.length();
        int i =0;
        while (i < a)
        {
            if (i==a-1) S3 = S3 + S1.charAt(i);
            else S3 = S3 + S1.charAt(i) + S2;
            i++;     
        }
        return S3;        
    }
    ////////////////////////////////////////////////////////////////////////////
    /// IntercalarChar de Docente
    public static String intercalarCharDoc(String S1, String S2)
    {
        String S3="";
        int i =0;
        while (i<S1.length() || i < S2.length())
        {
            if(i<S1.length()) S3 = S3 + S1.charAt(i);
            if(i<S2.length()) S3 = S3 + S2.charAt(i);
            i++;
        }
        return S3;
    }
    
}
