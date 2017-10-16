// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1016xP1;

public class Racional
{

    //Atributos
    private int num;
    private int den;

    //Constructor
    public Racional(int num, int den)
    {
        this.num = num;
        this.den = den;
    }

    //Metodos
    public String toString()
    {
        return this.num + " / " + this.den;
    }

    public boolean menor(Racional r1)
    {
        return this.num * r1.den < this.den * r1.num;
    }

    public boolean mayor(Racional r1)
    {
        return this.num * r1.den > this.den * r1.num;
    }

    public boolean equals(Racional r1)
    {
        return this.num * r1.den == this.den * r1.num;
    }

    public void sumar(Racional r1, Racional r2)
    {
        this.den = r1.den * r2.den;
        this.num = r1.num * r2.den + r1.den * r2.num;
    }
    
    public Racional sumarRac(Racional r1, Racional r2)
    {
        int den1 = r1.den * r2.den;
        int num1 = r1.num * r2.den + r1.den * r2.num;
        return new Racional(num1,den1);
    }

    public Racional multiplicar(Racional r1, Racional r2)
    {
        int num1 = r1.num * r2.num;
        int den1 = r1.den * r2.den;
        return new Racional(num1,den1);
    }
    
    public Racional reciproco()
    {
        int num1 = this.den;
        int den1 = this.num;
        return new Racional(num1,den1);
    }
   

    public void dividir(Racional r1, Racional r2)
    {
        this.num = r1.num * r2.den;
        this.den = r1.den * r2.num;
    }

    public void simplificar(Racional r1)
    {
        int mc = mcd(r1.num, r1.den);
        this.num = this.num / mc;
        this.den = this.den / mc;
    }

    ///////////////////////////////////////////////////////////////////////////
    public int mcd(int n, int m)
    {
        int i = 1, mc = 0;
        while (i <= n && i <= m)
        {
            if (n % i == 0 && n % i == 0)
            {
                mc = i;
            }
            i = i + 1;
        }
        return mc;
    }

}
