// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1009xP1;

public class Clase1009xP1
{

    public static void main(String[] args)
    {
        Lista03 L1 = new Lista03();
        Lista03 L2 = new Lista03();
        L1.insertarUlt(1);
        L1.insertarUlt(2);
        L1.insertarUlt(3);
        L1.insertarUlt(4);
        L1.insertarUlt(5);
        
        L2.insertarUlt(1);
        L2.insertarUlt(2);
        L2.insertarUlt(3);
        L2.insertarUlt(4);

        L1.eliminarTodo(L2);

        //L1.generalAleatorio(5,7,90);
        System.out.println(L1);

    }
}
