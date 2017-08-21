// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase2108xP1;

public class Clase2108xP1
{

    public static void main(String[] args)
    {
//        Tiempo t1 = new Tiempo(16, 20, 8);
//        Tiempo t2 = new Tiempo(16, 20, 10);
//
//        System.out.println(t1);
//        System.out.println(t1);
//
//        if (t1.menor(t2))
//        {
//            System.out.println("Es Menor");
//        }
//        else
//        {
//            System.out.println("NO es menor");
//        }
//        
//        if (t1.equals(t2))
//        {
//            System.out.println("Son Iguales");
//        }
//        else
//        {
//            System.out.println("NO son Iguales");
//        }

        Racional r1 = new Racional(2, 3);
        Racional r2 = new Racional(5, 6);

        //Vista
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.menor(r2));
        //operaciones
        Racional r3 = new Racional(1, 2);
        r3.dividir(r1, r2);
        System.out.println(r3);

        Racional R4 = new Racional(500, 1000);
        R4.simplificar(R4);
        System.out.println(R4);

    }
}
