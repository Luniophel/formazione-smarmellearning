package animale.specie;

import animale.Animale;
import animale.caratteristiche.Alato;

import java.util.Iterator;
import java.util.List;

public class Aquila extends Animale implements Alato {

    private double aperturaAlare = 0;

    public double getAperturaAlare() {
        return aperturaAlare;
    };
    public void setAperturaAlare(double aperturaAlare) {
        this.aperturaAlare = aperturaAlare;
    };

}
