// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package SegundoExamen;

public class SegundoExamen 
{
    public static void main(String[] args)
    {
        Computador C1 = new Computador("i3",5,2,1024,false);
        
        C1.quitarGPU();
        C1.modificarEspecificacionNum(1, 16);
        
        System.out.println(C1);
        System.out.println(C1.nombreCPUValido());
        System.out.println();
        
        
    }
}
