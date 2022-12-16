package utils;

import animale.Animale;

import java.util.Iterator;
import java.util.List;

public class Ricercatore {

    public Animale trovaPiuAlto (List<Animale> listaAnimali){

        Animale animalePiuAlto = listaAnimali.get(0);
        Iterator<Animale> iter = listaAnimali.iterator();
        while(iter.hasNext())
        {
            Animale curAnimale = iter.next();
            curAnimale.getAltezza();

            if (curAnimale.getAltezza()>animalePiuAlto.getAltezza()){
                animalePiuAlto = curAnimale;
            }
        }
        return animalePiuAlto;
    }

    public Animale trovaPiuBasso (List<Animale> listaAnimali){

        Animale animalePiuBasso = listaAnimali.get(0);
        Iterator<Animale> iter = listaAnimali.iterator();
        while(iter.hasNext())
        {
            Animale curAnimale = iter.next();
            curAnimale.getAltezza();

            if (curAnimale.getAltezza()<animalePiuBasso.getAltezza()){
                animalePiuBasso = curAnimale;
            }
        }
        return animalePiuBasso;
    }
}
