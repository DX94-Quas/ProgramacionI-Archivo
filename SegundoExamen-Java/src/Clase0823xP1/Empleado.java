// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0823xP1;

public class Empleado
{

//    Implementar el mètodo toString() e implementar al menos otros cinco métodos. 
//    La politica de la empresa ha definido algunos beneficios a sus empleados tales como:
//
//    - Asignar un monto mensual de 150 Bs por hijo.
//    - Asignar un bono de antiguedad que es igual al p% del sueldo básico, 
//      dónde p es igual a los años de servicio.
//    - Cada empleado tiene una categorìa: Inicial (menos de 5 años de antiguedad), 
//      Media (5 a 9 años de antiguedad) y Experto (10 o más años de antiguedad).
//    - En todos los reportes, a los empleados de la empresa se hace referencia 
//      como Sr. si el empleado es hombre y Sra. si el empleado es mujer.
    private String nombre;
    private String sexo;
    private double sueldo;
    private int hijos;
    private double tserv;

    public Empleado(String nombre,
            String sexo,
            double sueldo,
            int hijos,
            double tserv)
    {
        this.nombre = nombre;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.hijos = hijos;
        this.tserv = tserv;
    }

    public String toString()
    {
        if (sexo == "hombre")
        {
            return "Sr. " + this.nombre
                    + ", "
                    + this.sueldo
                    + "$, "
                    + this.hijos
                    + " hijos, "
                    + this.tserv
                    + " anos.";
        }
        else if (sexo == "mujer")
        {
            return "Sra. " + this.nombre
                    + ", "
                    + this.sueldo
                    + "$, "
                    + this.hijos
                    + " hijos, "
                    + this.tserv
                    + " anos.";
        }
        else
        {
            return "";
        }
    }

    public String categoria()
    {
        if (this.tserv < 5)
        {
            return "Inicial";
        }
        else if (this.tserv >= 5 && this.tserv <= 9)
        {
            return "Media";
        }
        else
        {
            return "Experto";
        }
    }

    public void bonoHijo()
    {
        for (int i = 0; i < this.hijos; i++)
        {
            this.sueldo = this.sueldo + 150;
        }
    }

    public void bonoTServ()
    {
        this.sueldo = this.sueldo + this.sueldo * (this.tserv / 100);
    }

    public boolean nombreValido()
    {
        for (int i = 0; i <= this.nombre.length() - 1; i++)
        {
            if (!Character.isLetter(this.nombre.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public void cambiarNombre(String S1)
    {
        this.nombre = S1;
    }

    public double beneficioTot()
    {
        double bon1 = 0;
        double bon2 = 0;
        for (int i = 0; i < this.hijos; i++)
        {
            bon1 = bon1 + 150;
        }
        bon2 = this.sueldo * (this.tserv / 100);
        return bon1 + bon2;
    }

    public void cambiarSueldo(double n)
    {
        this.sueldo = n;
    }
    
    public boolean HabAJub()
    {
        return this.tserv>15;
    }

}
