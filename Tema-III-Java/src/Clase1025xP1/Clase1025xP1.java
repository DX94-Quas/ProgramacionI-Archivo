// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase1025xP1;

import java.util.ArrayList;

public class Clase1025xP1
{

    public static void main(String[] args)
    {
        ArrayList<Integer> L1 = new ArrayList();
        int m[][] =
        {
            {
                1, 0, 0, 0, 0
            },
            {
                0, 1, 0, 0, 0
            }
        };
        generarAleatorio(m, 10, 99);
        mostrar(m);
        //elementosUnicos(m,L1);
        //digonalPrinc(m,L1);
        menorFilas(m, L1);
        System.out.println(L1);
    }

    public static void mostrar(int m[][])
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    //1
    public static void generarSec(int m[][], int init, int prog)
    {
        int aux = init;
        int auxProg = prog;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                m[i][j] = aux;
                aux = aux + auxProg;
            }
        }

    }

    //2
    public static void generarAleatorio(int m[][], int min, int max)
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                m[i][j] = aleatorio(min, max);
            }
        }
    }

    //4
    public static void numFilas(int m[][], int init, int prog)
    {
        int aux = init;
        int auxProg = prog;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                m[i][j] = aux;
            }
            aux = aux + auxProg;
        }
    }

    //5
    public static void numColumnas(int m[][], int init, int prog)
    {
        int aux = init;
        int auxProg = prog;
        int i = 0;
        int j = 0;
        while (i < m.length)
        {
            while (j < m[i].length)
            {
                m[i][j] = aux;
                aux = aux + auxProg;
                j++;
            }
            aux = init;
            j = 0;
            i++;
        }
    }

    //6
    public static void generarIdentidad(int m[][])
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (i == j)
                {
                    m[i][j] = 1;
                }
                else
                {
                    m[i][j] = 0;
                }

            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // MATRIZ CON LISTA
    //1
    public static void sumaColumnas(int m[][], ArrayList<Integer> L1)
    {
        int i = 0;
        int j = 0;
        while (j < m[0].length)
        {
            int sum = 0;
            while (i < m.length)
            {
                sum = sum + m[i][j];
                i++;
            }
            L1.add(sum);

            i = 0;
            j++;
        }
    }

    //2
    public static void sumaFilas(int m[][], ArrayList<Integer> L1)
    {

        for (int i = 0; i < m.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++)
            {
                sum = sum + m[i][j];
            }
            L1.add(sum);
        }
    }

    //3
    public static void menorColumnas(int m[][], ArrayList<Integer> L1)
    {
        int i = 0;
        int j = 0;
        for (j = 0; j < m[i].length; j++)
        {
            int menor = m[0][j];
            for (i = 0; i < m.length; i++)
            {
                if (m[i][j] < menor)
                {
                    menor = m[i][j];
                }
            }
            L1.add(menor);
        }
    }

    //4
    public static void menorFilas(int m[][], ArrayList<Integer> L1)
    {
        for (int i = 0; i < m.length; i++)
        {
            int menor = m[i][0];
            for (int j = 0; j < m[i].length; j++)
            {
                if (m[i][j] < menor)
                {
                    menor = m[i][j];
                }
            }
            L1.add(menor);
        }
    }

    //5
    public static void digonalPrinc(int m[][], ArrayList<Integer> L1)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < m.length; i++)
        {
            for (j = 0; j < m[i].length; j++)
            {
                if (i == j)
                {
                    L1.add(m[i][j]);
                }
            }

        }
    }

    //6
    public void digonalSec(int m[][], ArrayList<Integer> L1)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < m.length; i++)
        {
            for (j = 0; j < m[i].length; j++)
            {
                if (i + j == m.length - 1)
                {
                    L1.add(m[i][j]);
                }
            }

        }
    }

    //7
    public static void elementosUnicos(int m[][], ArrayList<Integer> L1)
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (frec(m, m[i][j]) == 1 && !L1.contains(m[i][j]))
                {
                    L1.add(m[i][j]);
                }
            }
        }
    }

    //8
    public static void elementosComunes(int m[][], ArrayList<Integer> L1)
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (frec(m, m[i][j]) > 1 && !L1.contains(m[i][j]))
                {
                    L1.add(m[i][j]);
                }
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    public static int aleatorio(int a, int b)
    {
        return a + (int) (Math.random() * (b - a));
    }

    public static int frec(int m[][], int x)
    {
        int freq = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (m[i][j] == x)
                {
                    freq = freq + 1;
                }
            }
        }
        return freq;
    }
}
