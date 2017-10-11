// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1009xP1;

//import java.math.*;
public class Lista03
{

    //Atributos
    private int cantElem;
    private int max;
    private int elem[];

    //Constructor
    public Lista03(int max)
    {
        this.cantElem = 0;
        this.max = max;
        this.elem = new int[max];
    }

    public Lista03()
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

    public void eliminarIesimos(int i, int n)
    {
        int k = 1;
        while (k <= n)
        {
            this.eliminarIesimo(i);
            k = k + 1;
        }
    }

    public void eliminarPrim(int n)
    {
        this.eliminarIesimos(0, n);
    }

    //1
    public void insertarLugarAsc(int x)
    {
        int i = this.cantElem - 1;
        while (i >= 0 && x < this.elem[i])
        {
            this.elem[i + 1] = this.elem[i];
            i = i - 1;
        }
        this.elem[i + 1] = x;
        this.cantElem = this.cantElem + 1;
    }

    //2
    public void insertarLugarDesc(int x)
    {
        int i = this.cantElem - 1;
        while (i >= 0 && x > this.elem[i])
        {
            this.elem[i + 1] = this.elem[i];
            i = i - 1;
        }
        this.elem[i + 1] = x;
        this.cantElem = this.cantElem + 1;
    }

    //3
    public void generarAleatorio(int n, int a, int b)
    {
        int i = 1;
        while (i <= n)
        {
            int r = this.aleatorio(a, b);
            this.insertarUlt(r);
            i = i + 1;
        }
    }

    //4
    public void generarAzarAsc(int n, int a, int b)
    {
        int i = 1;
        while (i <= n)
        {
            int r = this.aleatorio(a, b);
            this.insertarLugarAsc(r);
            i = i + 1;
        }
    }

    //5
    public void generarAzarDesc(int n, int a, int b)
    {
        int i = 1;
        while (i <= n)
        {
            int r = this.aleatorio(a, b);
            this.insertarLugarDesc(r);
            i = i + 1;
        }
    }

    //7
    public void generarAzarIguales(int n, int a, int b)
    {
        int i = 0;
        int r = this.aleatorio(a, b);
        while (i < n)
        {
            this.insertarUlt(r);
            i = i + 1;
        }
    }

    //8
    public void generarSecuencia(int n, int a, int k)
    {
        int i = 0;
        while (i <= n)
        {
            this.insertarUlt(a + i * k);
            i = i + 1;
        }
    }

    //9
    public void generarFactoriales(int n)
    {
        int i = 0;
        while (i < n)
        {
            int e = this.factorial(i + 1);
            this.insertarUlt(e);
            i = i + 1;
        }
    }

    //10
    public void generarPotencia(int n, int b)
    {
        int i = 0;
        while (i <= n)
        {
            int e = (int) (Math.pow(b, i));
            this.insertarUlt(e);
            i = i + 1;
        }
    }

    //11
    public void eliminarTodo(int x)
    {
        int i = 0;
        while (i < this.cantElem)
        {
            if (x == this.elem[i])
            {
                this.eliminarIesimo(i);;
            }
            else
            {
                i = i + 1;
            }
        }
    }

    //13
    public void eliminarUnicos()
    {
        int i = 0;
        while (i < this.cantElem)
        {
            if (this.frecuencia(this.elem[i]) <= 1)
            {
                this.eliminarTodo(this.elem[i]);
            }
            i = i + 1;
        }
    }
    
    //14
    public void eliminarTodo(Lista03 L2)
    {
        int i=0;
        while(i<this.cantElem)
        {
            if(L2.frecuencia(this.elem[i])>0)
            {
                this.eliminarTodo(this.elem[i]);
            }
            i=i+1;
        }
    }
    

    ///////////////////////////////////////////////////////////////////////////
    // Metodos Auxiliares
    public void insertarUlt(int x)
    {
        this.elem[this.cantElem] = x;
        this.cantElem++;
    }

    public void intercambiar(int i, int j)
    {
        int avx = this.elem[i];
        this.elem[i] = this.elem[j];
        this.elem[j] = avx;
    }

    public int aleatorio(int a, int b)
    {
        return a + (int) (Math.random() * (b - a));
    }

    public int frecuencia(int x)
    {
        int i = 0;
        int c = 0;
        while (i < this.cantElem)
        {
            if (this.elem[i] == x)
            {
                c++;
            }
            i=i+1;
        }
        return c;
    }

    public int factorial(int numero)
    {
        if (numero == 0)
        {
            return 1;
        }
        else
        {
            return numero * factorial(numero - 1);
        }
    }
}
