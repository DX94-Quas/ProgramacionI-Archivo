// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package Tarea1;

public class Tarea1 
{
    public static void main(String[] args) 
    {
        //37
        System.out.println(extensionArchivo("virus.java"));
        //48
        System.out.println(emailValido("form5498@hotmail.com"));
        //28
        System.out.println(generarCadena("abc",3));
        //35
        System.out.println(entreParentesis("fo(rgreg)ghrieg"));
        //14
        System.out.println(tienetodasVocales("AEIO"));
        //2
        System.out.println(sinVocales("frhgjtp"));
        //20
        System.out.println(charIguales("aeeeeeaaeee"));
        //6
        System.out.println(sumaDigitos("2222"));
        //18
        System.out.println(puroVocales("aaaaaab"));
        //41
        System.out.println(dividirChar("333333"));
        //38
        System.out.println(vocales("programacion"));
        //39
        System.out.println(strSinVocales("programacion"));
        //5
        System.out.println(extraerDigitos("madam777888"));
        //25
        System.out.println(eliminarVocales("madam"));
        //26
        System.out.println(eliminarDigitos("eltocho777x78"));
        //24
        System.out.println(separarChar("asdf","123"));
        //34
        System.out.println(comentarioEliminado("asdf //esto borra el disco C"));
        //4
        System.out.println(eliminarEspacios("el perro"));
        //23
        System.out.println(vocalesToMay("elperro"));
        //36
        System.out.println(formatoComas("lo bueno,lo malo,lo feo"));
        //30
        System.out.println(justificarDer("abc","def",5));
        //32
        System.out.println(cantidadCadena("x","abcabcabc"));
        //10
        System.out.println(eliminarChar("abcdefghijk","agk"));
        //3
        System.out.println(cadenaInvertida("madam"));
        //11
        System.out.println(pasarMay("abcdefghijk","agk"));
        //33
        System.out.println(eliminarUltimo("abc","asdfgHabcXweq"));
        //1
        System.out.println(vocalesJuntas("sdfeagh"));
        //42
        System.out.println(tieneDiptongo("sdfegh"));
        //12
        System.out.println(esSecuencia("xyzxyzxyz","xyz"));
        //13
        System.out.println(diaSemana("asdghjtghntmartesbfuvbu"));
        //7
        System.out.println(charDiferentes("abcdaaa"));
        //15
        System.out.println(ordenado("fhgbutgbv"));
        ///////////////////////////////////////////////////////////////////////
        //Pruebas de Librerias Meme
        System.out.println(ordenAsc("123456789"));
        System.out.println(ordenDesc("123456789"));
    }
    ///////////////////////////////////////////////////////////////////////////
    //1
    public static boolean vocalesJuntas(String S1)
    {
        int i=0;
        int a=0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) && isVocal(S1.charAt(i+1)) == true) a++;
            i=i+1;
        }
        return a != 0;
    }
    //2
    public static boolean sinVocales(String S1)
    {
        int may = 0;
        int men = 0;
        int a = S1.indexOf("a");
        int e = S1.indexOf("e");
        int i = S1.indexOf("i");
        int o = S1.indexOf("o");     
        int u = S1.indexOf("u");       
        int A = S1.indexOf("A");
        int E = S1.indexOf("E");
        int I = S1.indexOf("I");
        int O = S1.indexOf("O");
        int U = S1.indexOf("U");
        if (a == -1 && e == -1 && i == -1 && o == -1 && u == -1) may = 1;
        if (A == -1 && E ==-1 && I ==-1 && O ==-1 && U ==-1) men = 1;
        return may==1 && men ==1;
    }
    //3
    public static String cadenaInvertida(String S1)
    {
        int i = 0;
        int s = S1.length() -1;
        String S2 = "";
        while(i < S1.length())
        {
            S2 = S2 + S1.charAt(s - i);
            i++;
        }
        return S2;
    }
    //4
    public static String eliminarEspacios(String S1)
    {
        String S2 = "";
        int a = S1.length();
        int i =0;
        while (i < a)
        {
            if ( S1.charAt(i) != ' ' ) S2 = S2 + S1.charAt(i);
            i++;     
        }
        return S2; 
    }
    //5
    public static String extraerDigitos(String S1)
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
    //6
    public static int sumaDigitos( String S1 )
    {
        int i=0;
        int suma =0;
        while(i<S1.length())
        {
            if (Character.isDigit(S1.charAt(i))) suma = suma + Character.getNumericValue(S1.charAt(i));
            i++;
        }
        return suma;
    }
    //7
    public static boolean charDiferentes(String S1)
    {
        int i=0;
        int a=0;
        while (i < S1.length())
        {
            if (cantidadMod(S1,S1.charAt(i)) > 1) a++;
            i=i+1;
        }
        return a == 0;
    }
    //10
    public static String eliminarChar(String S1, String S2)
    {
        int i =0;
        String S3 = "";
        while(i < S1.length())
        {
            if(S2.indexOf(S1.charAt(i)) == -1) S3 = S3 + S1.charAt(i);
            i++;
        }
        return S3;
    }
    //11
    public static String pasarMay(String S1, String S2)
    {
        int i =0;
        String S3 = "";
        while(i < S1.length())
        {
            if(S2.indexOf(S1.charAt(i)) != -1) S3 = S3 + Character.toUpperCase(S1.charAt(i));
            else S3 = S3 + S1.charAt(i);
            i++;
        }
        return S3;
    }
    //12 
    public static boolean esSecuencia(String S1, String S2)
    {
        int k = cantidadCadena(S2,S1);
        int l = S1.length();
        return k*S2.length() == l;
    }
    //13
    public static boolean diaSemana(String S1)
    {
        int l = S1.indexOf("lunes");
        int m = S1.indexOf("martes");
        int x = S1.indexOf("miercoles");
        int j = S1.indexOf("jueves");     
        int v = S1.indexOf("viernes");       
        int s = S1.indexOf("sabado");
        int d = S1.indexOf("domingo");
        return l != -1 || m != -1 || x != -1 || j != -1 || v != -1 || s != -1 || d != -1;
    }
    //14
    public static boolean tienetodasVocales(String S1)
    {
        int may = 0;
        int men = 0;
        int a = S1.indexOf("a");
        int e = S1.indexOf("e");
        int i = S1.indexOf("i");
        int o = S1.indexOf("o");     
        int u = S1.indexOf("u");       
        int A = S1.indexOf("A");
        int E = S1.indexOf("E");
        int I = S1.indexOf("I");
        int O = S1.indexOf("O");
        int U = S1.indexOf("U");
        if (a != -1 && e != -1 && i != -1 && o != -1 && u != -1) may = 1;
        if (A !=-1 && E !=-1 && I !=-1 && O !=-1 && U !=-1) men =1;
        return may==1 || men ==1;
    }
    //15
    public static boolean ordenado(String S1)
    {
        return ordenAsc(S1) || ordenDesc(S1);
    }
    //16
    public static boolean puroLetras(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isLetter(S1.charAt(i))) return false;
            i=i+1;
        }
        return true;
    }
    //17
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
    //18
    public static boolean puroVocales (String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) == false) return false;
            i=i+1;
        }
        return true;
    }
    //19
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
    //20
    public static boolean charIguales(String S1)
    {
        return cantidadMod(S1,S1.charAt(0)) == S1.length();
    }
    //21
    public static boolean soloLetrasMay(String S1)
    {
        int i = 0;
        while (i < S1.length())
        {
            if (Character.isUpperCase(S1.charAt(i))) return false;
            i=i+1;
        }
    return true;
    }
    //22
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
    //23
    public static String vocalesToMay(String S1)
    {
        String S2 = "";
        int i=0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) == true) S2 = S2 + Character.toUpperCase(S1.charAt(i));
            else S2 = S2 + S1.charAt(i);
            i=i+1;
        }
        return S2;
    }
    //24
    public static String separarChar(String S1, String S2)
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
    //25
    public static String eliminarVocales(String S1)
    {
        String S2 = "";
        int i=0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) == false) S2 = S2 + S1.charAt(i);
            i=i+1;
        }
        return S2;
    }
    //26
    public static String eliminarDigitos(String S1)
    {
        String S2="";
        int i = 0;
        while (i < S1.length())
        {
            if (!Character.isDigit(S1.charAt(i))) S2 = S2 + S1.charAt(i);
            i=i+1;
        }
        return S2;
    }
    //28
    public static String generarCadena(String S1, int n)
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
    //30
    public static String justificarDer(String S1, String S2, int n)
    {
        int i=0;
        String S3 = "";
        String SA;
        while(i < n)
        {
            S3 = S3 + " ";
            i++;
        }
        SA = S2 + S3 + S1;
        return SA; 
    }
    //32
    public static int cantidadCadena(String S1, String S2)
    {
        int k = S2.indexOf(S1), c = 0;
        while ( k >=0 )
        {
            c = c + 1;
            k = S2.indexOf(S1, k + 1);
        }
        return c;
    }
    //33
    public static String eliminarUltimo(String S1, String S2)
    {
        String S3;
        int a = S2.lastIndexOf(S1);
        int b = S1.length();
        //S2 = S1.substring(a+1, 4);
        S3 = S2.substring(0,a) + S2.substring(a+b);  
        return S3;
    }
    //34
    public static String comentarioEliminado(String S1)
    {
        int k;
       String S2;
       k = S1.indexOf("//");
       S2 = S1.substring(0, k-1);
       return S2;
    }
    //35
    public static String entreParentesis(String S1)
    {
        int a = S1.indexOf("(");
        int b = S1.indexOf(")");
        String S2;
        S2 = S1.substring(a+1, b);
        return S2;
    }
    //36
    public static String formatoComas(String S1)
    {
        String S2 = "";
        int a = S1.length();
        int i =0;
        while (i < a)
        {
            if ( S1.charAt(i) == ',' ) S2 = S2 + ", ";
            else S2 = S2 + S1.charAt(i);
            i++;     
        }
        return S2;
    }
    //37
    public static String extensionArchivo(String S1)
    {
       int k;
       String S2;
       k = S1.indexOf(".");
       S2 = S1.substring(k+1);
       return S2;
    }
    //38
    public static String vocales(String S1)
    {
        String S2 = "";
        int i=0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) == true) S2 = S2 + S1.charAt(i);
            i=i+1;
        }
        return S2;
    }
    //39
    public static String strSinVocales(String S1)
    {
        String S2 = "";
        int i=0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) == false) S2 = S2 + S1.charAt(i);
            i=i+1;
        }
        return S2;
    }
    //41
    public static String dividirChar(String S1)
    {
        String S2 = "";
        int a = S1.length();
        int i =0;
        while (i < a)
        {
            if (i==a-1) S2 = S2 + S1.charAt(i);
            else S2 = S2 + S1.charAt(i) + "-";
            i++;     
        }
        return S2;  
    }
    //42
    public static boolean tieneDiptongo(String S1)
    {
        int i=0;
        int a=0;
        while (i < S1.length())
        {
            if (isVocal(S1.charAt(i)) && isVocal(S1.charAt(i+1)) == true) a++;
            i=i+1;
        }
        return a != 0;
    }
    //48
    public static boolean emailValido(String S1)
    {
        int i1 = S1.indexOf("@hotmail.com");
        int i2=0;
        int i3=0;
        if (i1 >= 0)
        {
            while (i2 < i1)
            {
                if (!Character.isLetterOrDigit(S1.charAt(i2))) i3=i3+1;
                i2=i2+1;
            }
        }
        return i1!=-1 && i3==0 ;
    }
    ///////////////////////////////////////////////////////////////////////////
    // Librerias Meme necesarias paq todo funcione
    public static boolean isVocal (char ch)
    {
        return "AEIOUaeiou".indexOf(ch) >= 0;
    }
    //
    public static int cantidadMod(String S1, char S2)
    {
        int k = S1.indexOf(S2), c = 0;
        while ( k >=0 )
        {
            c = c + 1;
            k = S1.indexOf(S2, k + 1);
        }
        return c;
    }
    //
    public static boolean ordenAsc(String S1)
    {
        for (int i1=0 ; i1 < S1.length() - 1 ; i1++)
        {
           if (S1.charAt(i1) > S1.charAt(i1+1) ) return false;
        }
        return true;
    }
    //
    public static boolean ordenDesc(String S1)
    {
        for (int i1=0 ; i1 < S1.length() - 1 ; i1++)
        {
           if (S1.charAt(i1) < S1.charAt(i1+1) ) return false;
        }
        return true;
    }
}
