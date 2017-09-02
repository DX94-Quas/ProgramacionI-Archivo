// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0823xP1;

public class Clase2308xP1
{

    public static void main(String[] args)
    {
//        PUNTEROS
//        If(E2==E3)           //Apunta al mismo objeto?
//        If(E1.equals(E2){...}     //Contenidos Iguales?
//        Empleado E1 = new Empleado("Jorge",70,80);
//        Empleado E2;
//                 E2 = new Empleado("Eduardo",68,75);
//        Empleado E3 = E2;
//        System.out.println(E1);
//        System.out.println(E1.promedio());
        // Clase Estudiante
        Estudiante E1 = new Estudiante("Joel", 75, 85, 60, 65);
        E1.cambiarNota(3, 85);

        System.out.println(E1);
        System.out.println(E1.mostrarNota(3));
        System.out.println(E1.promedio());
        System.out.println(E1.aprobado());
        System.out.println(E1.notaValida());

        //Clase Empleado
        Empleado X1 = new Empleado("Mariel6", "mujer", 2500, 4, 10);

        X1.bonoTServ();

        System.out.println(X1);
        System.out.println(X1.categoria());
        System.out.println(X1.nombreValido());
        System.out.println(X1.beneficioTot());

    }
}
