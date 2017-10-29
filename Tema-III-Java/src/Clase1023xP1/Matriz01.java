// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1023xP1;

import java.util.*;

public class Matriz01
{

    private int maxFil;
    private int maxCol;
    private int cantFil;
    private int cantCol;

    private int elem[][];

    public Matriz01(int maxFil, int maxCol)
    {
        this.maxFil = maxFil;
        this.maxCol = maxCol;
        this.cantFil = this.cantCol = 0;
        this.elem = new int[maxFil][maxCol];
    }

    public void dimensionar(int cantFil, int cantCol)
    {
        this.cantFil = cantFil;
        this.cantCol = cantCol;
    }

    public void mostrar()
    {
        for (int i = 0; i < this.cantFil; i++)
        {
            for (int j = 0; j < this.cantCol; j++)
            {
                System.out.print(this.elem[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    ///////////////////////////////////////////////////////////////////////////
    // Lab1
    //1
    public void generarOrdenado(int init, int prog)
    {
        int aux = init;
        int auxProg = prog;
        for (int i = 0; i < this.cantFil; i++)
        {
            for (int j = 0; j < this.cantCol; j++)
            {
                this.elem[i][j] = aux;
                aux = aux + auxProg;
            }
        }
    }

    //2
    public void generarAleatorio(int min, int max)
    {
        for (int i = 0; i < this.cantFil; i++)
        {
            for (int j = 0; j < this.cantCol; j++)
            {
                this.elem[i][j] = aleatorio(min, max);
            }
        }
    }

    //4
    public void filaOrdenada(int init, int prog)
    {
        int aux = init;
        int auxProg = prog;
        for (int i = 0; i < this.cantFil; i++)
        {
            for (int j = 0; j < this.cantCol; j++)
            {
                this.elem[i][j] = aux;
            }
            aux = aux + auxProg;
        }
    }

    //5
    public void columnaOrdenada(int init, int prog)
    {
        int aux = init;
        int auxProg = prog;
        for (int j = 0; j < this.cantCol; j++)
        {
            for (int i = 0; i < this.cantFil; i++)
            {
                this.elem[i][j] = aux;
            }
            aux = aux + auxProg;
        }
    }

    //6
    public void identidad()
    {
        for (int i = 0; i < this.cantFil; i++)
        {
            for (int j = 0; j < this.cantCol; j++)
            {
                if (i == j)
                {
                    this.elem[i][j] = 1;
                }
                else
                {
                    this.elem[i][j] = 0;
                }

            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //Lab2
    //1
    public void sumaColumnas(ArrayList<Integer> L1)
    {

        for (int j = 0; j < this.cantCol; j++)
        {
            int sum = 0;
            for (int i = 0; i < this.cantFil; i++)
            {
                sum = sum + this.elem[i][j];
            }
            L1.add(sum);
        }
    }

    //2
    public void sumaFilas(ArrayList<Integer> L1)
    {

        for (int i = 0; i < this.cantFil; i++)
        {
            int sum = 0;
            for (int j = 0; j < this.cantCol; j++)
            {
                sum = sum + this.elem[i][j];
            }
            L1.add(sum);
        }
    }

    //3
    public void menorColumnas(ArrayList<Integer> L1)
    {
        for (int j = 0; j < this.cantCol; j++)
        {
            int menor = this.elem[0][j];
            for (int i = 0; i < this.cantFil; i++)
            {
                if (this.elem[i][j] < menor)
                {
                    menor = this.elem[i][j];
                }
            }
            L1.add(menor);
        }
    }

    //4
    public void menorFilas(ArrayList<Integer> L1)
    {
        for (int i = 0; i < this.cantFil; i++)
        {
            int menor = this.elem[i][0];
            for (int j = 0; j < this.cantCol; j++)
            {
                if (this.elem[i][j] < menor)
                {
                    menor = this.elem[i][j];
                }
            }
            L1.add(menor);
        }
    }

    //5
    public void digonalPrinc(ArrayList<Integer> L1)
    {
        for (int j = 0; j < this.cantCol; j++)
        {
            for (int i = 0; i < this.cantFil; i++)
            {
                if (i == j)
                {
                    L1.add(this.elem[i][j]);
                }
            }

        }
    }

    //6
    public void digonalSec(ArrayList<Integer> L1)
    {
        for (int j = 0; j < this.cantCol; j++)
        {
            for (int i = 0; i < this.cantFil; i++)
            {
                if (i + j == this.cantFil - 1)
                {
                    L1.add(this.elem[i][j]);
                }
            }

        }
    }

    //7
    public void elementosUnicos(ArrayList<Integer> L1)
    {
        for (int j = 0; j < this.cantCol; j++)
        {
            for (int i = 0; i < this.cantFil; i++)
            {
                if (this.frec(this.elem[i][j]) == 1 && !L1.contains(this.elem[i][j]))
                {
                    L1.add(this.elem[i][j]);
                }
            }
        }
    }

    //8
    public void elementosComunes(ArrayList<Integer> L1)
    {
        for (int j = 0; j < this.cantCol; j++)
        {
            for (int i = 0; i < this.cantFil; i++)
            {
                if (this.frec(this.elem[i][j]) > 1 && !L1.contains(this.elem[i][j]))
                {
                    L1.add(this.elem[i][j]);
                }
            }
        }

    }

    ///////////////////////////////////////////////////////////////////////////
    public int aleatorio(int a, int b)
    {
        return a + (int) (Math.random() * (b - a));
    }

    public int frecStr(ArrayList<Integer> L1, int x)
    {
        int freq = 0;
        int i = 0;
        while (i < L1.size())
        {
            if (L1.get(i) == x)
            {
                x = x + 1;
            }
            i = i + 1;
        }
        return freq;
    }

    public int frec(int x)
    {
        int freq = 0;
        for (int j = 0; j < this.cantCol; j++)
        {
            for (int i = 0; i < this.cantFil; i++)
            {
                if (this.elem[i][j] == x)
                {
                    freq = freq + 1;
                }
            }
        }
        return freq;
    }

}
