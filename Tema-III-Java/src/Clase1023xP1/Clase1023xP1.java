// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1023xP1;

import java.util.*;

public class Clase1023xP1
{

    public static void main(String[] args)
    {
        Matriz01 m1 = new Matriz01(10, 10);
        ArrayList<Integer> L1 = new ArrayList();
        m1.dimensionar(4, 4);
        //m1.generarAleatorio(10, 99);
        m1.generarAleatorio(10, 90);
        m1.elementosUnicos(L1);
        System.out.println(m1);
        System.out.println(L1);
    }
}
