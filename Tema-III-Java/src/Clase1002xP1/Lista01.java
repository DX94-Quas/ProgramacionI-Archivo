// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1002xP1;

public class Lista01
{

    //Atributos
    private int cantElem;
    private int max;
    private int elem[];

    //Constructor
    public Lista01(int max)
    {
        this.cantElem = 0;
        this.max = max;
        this.elem = new int[max];
    }

    public Lista01()
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

    //1
    public void ordenarSeleccionAsc()
    {
        //Seleccion Directa
        int i = 0;
        while (i < this.cantElem)
        {
            int men = this.elem[i];
            int k = i;
            int j = i;
            while (j < this.cantElem)
            {
                if (this.elem[j] < men)
                {
                    men = this.elem[j];
                    k = j;
                }
                j = j + 1;
            }
            this.intercambiar(i, k);
            i = i + 1;
        }
    }

    //2
    public void ordenarSeleccionDesc()
    {
        //Selecc Directa
        int i = 0;
        while (i < this.cantElem)
        {
            int may = this.elem[i];
            int k = i;
            int j = i;
            while (j < this.cantElem)
            {
                if (this.elem[j] > may)
                {
                    may = this.elem[j];
                    k = j;
                }
                j = j + 1;
            }
            this.intercambiar(i, k);
            i = i + 1;
        }
    }

    //3
    public void ordenarInsercionAsc()
    {
        int i = 1;
        while (i < this.cantElem)
        {
            int j = i - 1;
            int x = this.elem[i];
            while (j >= 0 && this.elem[j] > x)
            {
                this.elem[j + 1] = this.elem[j];
                j = j - 1;
            }
            this.elem[j + 1] = x;
            i = i + 1;
        }
    }

    //4
    public void ordenarInsercionDesc()
    {
        int i = 1;
        while (i < this.cantElem)
        {
            int j = i - 1;
            int x = this.elem[i];
            while (j >= 0 && this.elem[j] < x)
            {
                this.elem[j + 1] = this.elem[j];
                j = j - 1;
            }
            this.elem[j + 1] = x;
            i = i + 1;
        }
    }

    //8
    public void bubble_srt_asc()
    {
        int n = this.cantElem;
        int k;
        for (int m = n; m >= 0; m--)
        {
            for (int i = 0; i < n - 1; i++)
            {
                k = i + 1;
                if (this.elem[i] > this.elem[k])
                {
                    this.intercambiar(i, k);
                }
            }
        }
    }
    
    public void bubble_srt_desc()
    {
        int n = this.cantElem;
        int k;
        for (int m = n; m >= 0; m--)
        {
            for (int i = 0; i < n - 1; i++)
            {
                k = i + 1;
                if (this.elem[i] < this.elem[k])
                {
                    this.intercambiar(i, k);
                }
            }
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

}
