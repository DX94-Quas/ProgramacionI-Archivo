// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0920xP1;

public class Clase0920xP1
{

    public static void main(String[] args)
    {
        Lista L1 = new Lista(100);
        L1.insertarUlt(2);
        L1.insertarUlt(2);
        L1.insertarUlt(2);
        L1.insertarUlt(3);
        L1.insertarUlt(2);
        L1.insertarUlt(2);
        System.out.println(L1);
        System.out.println(L1.indexOf(2));
    }
}
