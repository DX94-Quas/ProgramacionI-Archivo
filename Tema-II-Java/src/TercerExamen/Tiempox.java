// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package TercerExamen;

public class Tiempox
{

    private int hora;
    private int min;
    private int seg;

    public Tiempox(int ora, int min, int seg)
    {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public String toString()
    {
        return this.hora + " : " + this.min + " : " + this.seg;
    }
    
    public boolean iguales(Tiempox t1)
    {
        return this.hora == t1.hora && this.min == t1.min && this.seg == t1.seg;
    }
    
    public boolean menor(Tiempox t1)
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
    
    public boolean esDeDia()
    {
        return this.hora > 6 && this.hora < 12;
    }
    
    public boolean esNoche()
    {
        return this.hora > 19 && this.hora < 24;
    }
    
    public boolean horaValida()
    {
        return this.hora >= 0 && this.hora <= 24; 
    }
}
