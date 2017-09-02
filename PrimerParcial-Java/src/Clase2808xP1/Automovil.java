// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase2808xP1;

public class Automovil
{

    private String modelo;
    private int velocidad;
    private int puertas;
    private int gasolina;
    private boolean esoriginal;

    public Automovil(String modelo, int velocidad, int puertas, int gasolina, boolean esoriginal)
    {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.puertas = puertas;
        this.gasolina = gasolina;
        this.esoriginal = esoriginal;

    }

    public String toString()
    {
        if (esoriginal)
        {
            return this.modelo
                    + "/"
                    + this.velocidad
                    + "/"
                    + this.puertas
                    + "/"
                    + this.gasolina
                    + "/ Es ORIGINAL";
        }
        else
        {
            return this.modelo
                    + "/"
                    + this.velocidad
                    + "/"
                    + this.puertas
                    + "/"
                    + this.gasolina
                    + "/ NO es ORIGINAL";
        }

    }

    public boolean esDeportivo()
    {
        return this.puertas <= 2 && this.velocidad > 200;
    }

    public String velos()
    {
        if (this.velocidad < 50)
        {
            return "Lento";
        }
        else if (this.velocidad > 51 && this.velocidad <= 90)
        {
            return "Moderado";
        }
        else if (this.velocidad > 91 && this.velocidad <= 200)
        {
            return " Veloz";
        }
        else
        {
            return "Lamborghini";
        }
    }

    public void puertasFregadas(int n)
    {
        if (n <= this.puertas)
        {
            this.puertas = this.puertas - n;
        }
        else
        {
            System.out.println("No existe esa cantidad de puertas");
        }
    }

    public boolean menor(Automovil C2)
    {
        if (this.velocidad < C2.velocidad)
        {
            return true;
        }
        else if (this.velocidad == C2.velocidad)
        {
            if (this.puertas < C2.puertas)
            {
                return true;
            }
            else if (this.puertas == C2.puertas)
            {
                if (this.gasolina < C2.gasolina)
                {
                    return true;
                }
                else if (this.gasolina == C2.gasolina)
                {
                    return false;
                }
            }
        }
        return false;
    }
    
   
}
