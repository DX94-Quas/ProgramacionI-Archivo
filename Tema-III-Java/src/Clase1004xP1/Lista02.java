// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1004xP1;

public class Lista02
{

    //Atributos
    private int cantElem;
    private int max;
    private int elem[];

    //Constructor
    public Lista02(int max)
    {
        this.cantElem = 0;
        this.max = max;
        this.elem = new int[max];
    }

    public Lista02()
    {
        this.max = 80;
        this.cantElem = 0;
        this.elem = new int[this.max];
    }

    //Metodos
    public String toString()
    {
        String S1 = "[";
        int i = 0;
        while (i < this.cantElem)
        {
            if (i == this.cantElem - 1)
            {
                S1 = S1 + this.elem[i];
            }
            else
            {
                S1 = S1 + this.elem[i] + ", ";
            }
            i = i + 1;
        }
        return S1 + "]";
    }

    ///////////////////////////////////////////////////////////////////////////
    //LAB 3
    //1
    public void insertarIesimo(int x, int i)
    {
        int j = this.cantElem - 1;
        while (j >= i)
        {
            this.elem[j + 1] = this.elem[j];
            j = j - 1;
        }
        this.elem[j + 1] = x;// to tambien this.elem[i]=x;
        this.cantElem = this.cantElem + 1;
    }

    //2
    public void insertarPrim(int x)
    {
        this.insertarIesimo(x, 0);
    }

    //3
    public void insertarUlt(int x)
    {
        this.insertarIesimo(x, this.cantElem);
    }

    //4
    public void eliminarIesimo(int i)
    {
        int j = i + 1;
        while (j < this.cantElem)
        {
            this.elem[j - 1] = this.elem[j];
            j = j + 1;
        }
        this.cantElem = this.cantElem - 1;
    }

    //5
    public void eliminarPrim()
    {
        this.eliminarIesimo(0);
    }

    //6
    public void eliminarUlt()
    {
        this.eliminarIesimo(this.cantElem - 1);
    }

    //7
    public void rotarIzqDer(int n)
    {
        int i = 1;
        while (i <= n)
        {
            int x = this.elem[this.cantElem - 1];
            this.eliminarUlt();
            this.insertarPrim(x);
            i++;
        }
    }

    //8
    public void rotarDerIzq(int n)
    {
        int i = 1;
        while (i <= n)
        {
            int x = this.elem[0];
            this.eliminarPrim();
            this.insertarUlt(x);
            i++;
        }
    }

    //9
    public void eliminarPrim(int n)
    {
        int i=0;
        while (i<n)
        {
            this.eliminarPrim();
            i=i+1;
        }
    }
    
    //10
    public void eliminarUlt(int n)
    {
                int i=0;
        while (i<n)
        {
            this.eliminarUlt();
            i=i+1;
        }
    }
    
    //11
    public void eliminarIesimo(int i, int n)
    {
        int c=0;
        while(c<n)
        {
            this.eliminarIesimo(i);
            c=c+1;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Metodos Auxiliares
    public void insertarUltimo(int x)
    {
        this.elem[this.cantElem] = x;
        this.cantElem++;
    }

}
