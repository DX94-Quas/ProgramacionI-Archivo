// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0821xP1;

public class Tiempo
{

    private int hora;
    private int min;
    private int seg;

    public Tiempo(int hora, int min, int seg)
    {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public String toString()
    {
        return this.hora + " : " + this.min + " : " + this.seg;
    }

    public boolean equals(Tiempo t1)
    {
        return this.hora == t1.hora && this.min == t1.min && this.seg == t1.seg;
    }

    public boolean menor(Tiempo t1)
    {
        if (this.hora < t1.hora)
        {
            return true;
        }
        else if (this.hora == t1.hora)
        {
            if (this.min < t1.min)
            {
                return true;
            }
            else if (this.min == t1.min)
            {
                if (this.seg < t1.seg)
                {
                    return true;
                }
                else if (this.seg == t1.seg)
                {
                    return false;
                }
            }
        }
        return false;
    }

}
