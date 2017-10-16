// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1004xP1;

public class Clase1004xP1
{

    public static void main(String[] args)
    {

        Lista02 L1 = new Lista02();
        Lista02 L2 = new Lista02();
        L1.insertarUltimo(1);
        L1.insertarUltimo(2);
        L1.insertarUltimo(3);
        L1.insertarUltimo(4);
        L1.insertarUltimo(5);
        L1.insertarUltimo(5);

//        L2.insertarUlt(1);
//        L2.insertarUlt(2);
//        L2.insertarUlt(3);
//        L2.insertarUlt(4);
        L1.eliminarIesimo(2, 2);

        System.out.println(L1);

    }
}
