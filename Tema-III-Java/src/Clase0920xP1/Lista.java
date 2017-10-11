// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0920xP1;

public class Lista
{

    //Atributos
    private int cantElem;
    private int max;
    private int elem[];

    //Constructor
    public Lista(int max)
    {
        this.cantElem = 0;
        this.max = max;
        this.elem = new int[max];
    }

    public Lista()
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

    public void insertarUlt(int x)
    {
        this.elem[this.cantElem] = x;
        this.cantElem++;
    }

    //1
    public int frecuencia(int x)
    {
        int frec = 0;
        int i = 0;
        while (i < this.cantElem)
        {
            if (x == this.elem[i])
            {
                frec = frec + 1;
            }
            i = i + 1;
        }
        return frec;
    }

    //2
    public boolean iguales()
    {
        return this.frecuencia(this.elem[0]) == this.cantElem;
    }

    //3
    public boolean diferentes()
    {
        int i = 0;
        while (i < this.cantElem)
        {
            if (this.frecuencia(this.elem[i]) != 1)
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //4
    public int mayor()
    {
        int i = 0;
        int mayor = this.elem[0];
        while (i < this.cantElem)
        {
            if (this.elem[i] > mayor)
            {
                mayor = this.elem[i];
            }
            i = i + 1;
        }
        return mayor;
    }

    //5
    public int menor()
    {
        int i = 0;
        int menor = this.elem[0];
        while (i < this.cantElem)
        {
            if (this.elem[i] < menor)
            {
                menor = this.elem[i];
            }
            i = i + 1;
        }
        return menor;
    }

    //6
    public boolean ordenado()
    {
        return this.ordenAsc() || this.ordenDesc();
    }

    //7
    public boolean pares()
    {
        int i = 0;
        while (i < this.cantElem)
        {
            if (this.elem[i] % 2 != 0)
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    //8
    public boolean parImpar()
    {
        int i = 0;
        while (i < this.cantElem)
        {
            if (this.elem[i] % 2 == 0 || this.elem[i] % 2 != 0)
            {
                return true;
            }
        }
        return false;
    }

    //9
    public int cantidadPares()
    {
        int i = 0;
        int cant = 0;
        while (i < this.cantElem)
        {
            if (this.elem[i] % 2 == 0)
            {
                cant = cant + 1;
            }
            i = i + 1;
        }
        return cant;
    }

    //10
    public int indexOf(int x)
    {
        int i = 0;
        while (i < this.cantElem)
        {
            if (this.elem[i] == x)
            {
                return i;
            }
            i = i + 1;
        }
        return -1;
    }

//////////////////////////////////////////////////////////////////////////
// Metodos Auxiliares
    public boolean ordenAsc()
    {
        int i = 0;
        while (i < this.cantElem - 1)
        {
            if (this.elem[i] > this.elem[i + 1])
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    public boolean ordenDesc()
    {
        int i = 0;
        while (i < this.cantElem - 1)
        {
            if (this.elem[i] < this.elem[i + 1])
            {
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
