// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0911xP1;

public class Clase0911xP1
{
    
    public static void main(String[] args)
    {
        //
        L5Tiempo T1 = new L5Tiempo(0, 0, 0);
        L5Tiempo T2 = new L5Tiempo(16, 45, 40);
        L5Tiempo T3 = new L5Tiempo(45, 30, 20);
        L5Tiempo T4 = new L5Tiempo(28, 12, 10);
        //
        T1.toTiempo(58360);
        System.out.println(T1);
        System.out.println(T2.toSeg());
        System.out.println(T4.tiempoTranscurrido(T3));
        System.out.println(T2.horaCivil());
    }
}
