// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package TercerExamen;

public class Estudiantex
{

    private String apellido;
    private int grado;
    private int edad;
    private boolean enClase;
    private int nota;

    public Estudiantex(String apellido, int grado, int edad, boolean enClase, int nota)
    {
        this.apellido = apellido;
        this.edad = edad;
        this.enClase = enClase;
        this.grado = grado;
        this.nota = nota;
    }

    public String toString()
    {
        String S1 = "Nombre; "
                + this.apellido
                + ", Grado: "
                + this.grado
                + ", Edad: "
                + this.edad
                + ", Nota: "
                + this.nota;
        if (this.enClase)
        {
            return S1 + ", Esta en Clase.";
        }
        else
        {
            return S1 + ", No esta en Clase.";
        }
    }

    public int notaMayor(Estudiantex e2)
    {
        if (e2.nota > this.nota)
        {
            return e2.nota;
        }
        else
        {
            return this.nota;
        }
    }

    public boolean mismaAula(Estudiantex e2, Estudiantex e3)
    {
        return this.enClase && e2.enClase && e3.enClase;
    }

    public void gradoSuperior()
    {
        this.grado = this.grado + 1;
    }

    public boolean aprobado()
    {
        return this.nota > 51;
    }

    public boolean nombreValido()
    {
        int i = 0;
        int n = this.apellido.length();
        while (i < 0)
        {
            if (i == 0)
            {
                if (Character.isLowerCase(this.apellido.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if (Character.isUpperCase(this.apellido.charAt(i)))
                {
                    return false;
                }
            }
            i = i + 1;
        }
        return true;
    }
}
