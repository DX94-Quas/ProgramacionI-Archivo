// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package SegundoExamen;

public class Computador
{

    private String cpu;
    private int RAM;
    private int hdd;
    private int caphdd;
    private boolean gpu;

    public Computador(String cpu, int RAM, int hdd, int caphdd, boolean gpu)
    {
        this.cpu = cpu;
        this.RAM = RAM;
        this.hdd = hdd;
        this.caphdd = caphdd;
        this.gpu = gpu;
    }

    public String toString()
    {
        if (gpu)
        {
            return this.cpu
                    + ", "
                    + this.RAM
                    + " GB, "
                    + this.hdd
                    + " discos, "
                    + this.caphdd
                    + " GB, "
                    + " Tiene GPU";
        }
        else
        {
            return this.cpu
                    + ", "
                    + this.RAM
                    + " GB, "
                    + this.hdd
                    + " discos, "
                    + this.caphdd
                    + " GB, "
                    + " NO tiene GPU";
        }
    }

    public void quitarGPU()
    {
        if (gpu)
        {
            this.gpu = false;
        }
        else
        {
            System.out.println("No tenia GPU");
        }
    }

    public boolean nombreCPUValido()
    {
        for (int i = 0; i < this.cpu.length(); i++)
        {
            if (!Character.isLetterOrDigit(this.cpu.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public void modificarEspecificacionNum(int attr, int mod)
    {
        if (attr == 2)
        {
            this.RAM = attr;
        }
        else if (attr == 3)
        {
            this.hdd = attr;
        }
        else if (attr == 4)
        {
            this.caphdd = attr;
        }
        else
        {
            System.out.println("Atributo no modificable por este medio");
        }
    }

}
