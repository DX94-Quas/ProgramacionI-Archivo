// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase2308xP1;

public class Estudiante
{

    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public Estudiante(String nombre, int nota1, int nota2, int nota3, int nota4)
    {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String toString()
    {
        return this.nombre + ", "
                + this.nota1 + ", "
                + this.nota2 + ", "
                + this.nota3 + ", "
                + this.nota4;
    }
    
    public int mostrarNota(int n)
    {
        if (n==1) return this.nota1;
        else if(n==2) return this.nota2;
        else if(n==3) return this.nota3;
        else if(n==4) return this.nota4;
        else return 0;
    }
    
    public int promedio()
    {
        return (this.nota1+
                this.nota2+
                this.nota3+
                this.nota4)/4;
    }
    
    public void cambiarNota(int nota, int grado)
    {
        if (nota==1) this.nota1 = grado;
        else if(nota==2) this.nota2 = grado;
        else if(nota==3) this.nota3 = grado;
        else if(nota==4) this.nota4 = grado;
    }
    
    public boolean aprobado()
    {
        if (this.nota1 < 60 
                || this.nota2 < 60
                || this.nota3 < 60
                || this.nota4 < 60) return false;
        else return true;
    }
    
    public boolean notaValida()
    {
        if (this.nota1 < 0 || this.nota1 > 100
                || this.nota2 < 0 || this.nota2 > 100
                || this.nota3 < 0 || this.nota3 > 100
                || this.nota4 < 0 || this.nota4 > 100) return false;
        else return true;
    }
}
