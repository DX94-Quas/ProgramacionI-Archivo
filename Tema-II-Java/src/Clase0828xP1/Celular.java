// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0828xP1;

public class Celular
{

    private String marca;
    private int bateria;
    private int px;
    private int precio;

    public Celular(String marca, int bateria, int px, int precio)
    {
        this.marca = marca;
        this.bateria = bateria;
        this.px = px;
        this.precio = precio;

    }

    public String toString()
    {
        return this.marca + 
                "/" + 
                this.bateria + 
                "/" + 
                this.px + 
                "/" + 
                this.precio;
    }

    public String duracion()
    {
        int i = 100;
        if (this.bateria <= i)
        {
            return "larga";
        }
        if (this.bateria > 1)
        {
            return "normal";
        }
        else
        {
            return "corta";
        }
    }
    
    public String resolucion()
    {
        if(this.px < 0)return "Calidad Invalida";
        else if (this.px >0 && this.px <= 5) return "Calidad Baja";
        else if (this.px >5 && this.px <= 18) return "Calidad Aceptable";
        else if (this.px >19 && this.px <= 100) return "Calidad Alta";
        else return "Calidad Inexistente en este mundo";
    }
    
    public String Precio()
    {
        if(this.precio < 0)return "precio Invalido";
        else if (this.precio >0 && this.precio <= 80) return "Gama Baja";
        else if (this.precio >81 && this.precio <= 400) return "Gama Media";
        else return "Gama Alta";
    }

    public boolean marcaValida()
    {
        for (int i = 0; i < this.marca.length(); i++)
        {
            if (!Character.isLetter(this.marca.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    
    public String masCaro(Celular c1)
    {
        if (c1.precio>this.precio)return "masCaro es el segundo";
        else if(c1.precio<this.precio)return "el mas caro es el primero";
        else return"son de igual precio";
    }
    
}
