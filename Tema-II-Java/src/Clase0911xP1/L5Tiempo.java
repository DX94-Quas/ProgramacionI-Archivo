// Para Info. de Licencias refiérase al archivo LICENSE ubicado
// donde estan contenidos todos los proyectos
package Clase0911xP1;

public class L5Tiempo
{

    private int hora;
    private int min;
    private int seg;

    public L5Tiempo(int hora, int min, int seg)
    {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public String toString()
    {
        return this.hora + " : " + this.min + " : " + this.seg;
    }

    public boolean equals(L5Tiempo t1)
    {
        return this.hora == t1.hora && this.min == t1.min && this.seg == t1.seg;
    }

    public boolean menor(L5Tiempo t1)
    {
        if (this.hora < t1.hora)
        {
            return true;
        }
        else if (this.hora == t1.hora)
        {
            if (this.min < t1.min)
            {
                return true;
            }
            else if (this.min == t1.min)
            {
                if (this.seg < t1.seg)
                {
                    return true;
                }
                else if (this.seg == t1.seg)
                {
                    return false;
                }
            }
        }
        return false;
    }

    ///////////////////////////////////////////////////////////////////////////
    //1
    public int toSeg()
    {
        return this.hora * 3600
                + this.min * 60
                + this.seg;
    }

    //2
    public void toTiempo(int k)
    {
        k = k % 86400;

        this.hora = k / 3600;
        this.min = (k % 3600) / 60;
        this.seg = (k % 3600) % 60;
    }

    //3
    public boolean menorSec(L5Tiempo TX1)
    {
        return this.toSeg() < TX1.toSeg();
    }

    //4
    public boolean mayorSec(L5Tiempo TX1)
    {
        return this.toSeg() > TX1.toSeg();
    }

    //5
    public boolean igualSec(L5Tiempo TX1)
    {
        return this.toSeg() == TX1.toSeg();
    }

    //6
    public void diferenciaOut(L5Tiempo TX1, L5Tiempo TX2)
    {
        if (TX2.menor(TX1))
        {
            this.toTiempo(TX1.toSeg() - TX2.toSeg());
        }
        else
        {
            this.toTiempo(TX2.toSeg() - TX1.toSeg());
        }
    }

    //9
    public void nextSec()
    {
        this.seg = this.seg + 1;
    }

    //10
    public void nextMin()
    {
        this.min = this.min + 1;
    }

    //11
    public void nextHour()
    {
        this.hora = this.hora + 1;
    }

    //12
    public void previousSec()
    {
        this.seg = this.seg - 1;
    }

    //13
    public void previousMin()
    {
        this.min = this.min - 1;
    }

    //14
    public void previousHour()
    {
        this.hora = this.hora - 1;
    }

    //15
    public boolean esMadrugada()
    {
        return this.hora >= 0 && this.hora <= 5;
    }

    //16
    public boolean esManana()
    {
        return this.hora >= 6 && this.hora <= 11;
    }

    //17
    public boolean esTarde()
    {
        return this.hora >= 12 && this.hora <= 18;
    }

    //18
    public boolean esNoche()
    {
        return this.hora >= 19 && this.hora <= 23;
    }

    //19
    public void adicionar(L5Tiempo TX2)
    {
        this.toTiempo(this.toSeg() + TX2.toSeg());
    }

    //20
    public void restar(L5Tiempo TX2)
    {
        if (this.menor(TX2))
        {
            this.toTiempo(TX2.toSeg() - this.toSeg());
        }
        else
        {
            this.toTiempo(this.toSeg() - TX2.toSeg());
        }
    }

    //21
    public L5Tiempo tiempoTranscurrido(L5Tiempo TX1)
    {
        L5Tiempo TX2 = new L5Tiempo(0, 0, 0);

        if (this.menor(TX1))
        {
            TX2.toTiempo(TX1.toSeg() - this.toSeg());
        }
        else
        {
            TX2.toTiempo(this.toSeg() - TX1.toSeg());
        }
        return TX2;
    }

    //22
    public String horaUniversal()
    {
        return this.hora + " : " + this.min + " : " + this.seg;
    }
    
    //23
    public String horaCivil()
    {
        if (this.min == 15)
        {
            return this.hora +
                    " y cuarto.";
        }
        else if (this.min ==30)
        {
            return this.hora +
                    " y media.";
        }
        else if (this.min ==45)
        {
            return (this.hora+1) +
                    " menos cuarto";
        }
        else if (this.min == 0)
        {
            return this.hora +
                    " en punto.";
        }
        else return this.hora +
                " : " + 
                this.min;
    }
}
