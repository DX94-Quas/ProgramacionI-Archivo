// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos

package TercerExamen;

public class Racionalx 
{
    private int num;
    private int den;
    
    public Racionalx(int num, int den)
    {
        this.num=num;
        this.den=den;
    }
    
    public String toString()
    {
        return this.num + " / " + this.den;
    }
    
    public boolean esEntero()
    {
        return this.num == this.den;
    }
    
    public boolean menorACero()
    {
        return this.num < this.den;
    }
    
    public boolean numeroMixto()
    {
        return this. num > this.den;
    }
    
    public void division(Racionalx r2)
    {
        this.num = this.num*r2.den;
        this.den = this.den*this.num;
    }
    
    public boolean sumaDirecta(Racionalx r2)
    {
        return this.den == r2.den;
    }
}
