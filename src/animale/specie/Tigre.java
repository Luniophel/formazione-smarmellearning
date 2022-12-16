package animale.specie;

import animale.Animale;
import animale.caratteristiche.Caudato;

public class Tigre extends Animale {

    private double lunghezzaCoda = 0;

    public double getLunghezzaCoda() {
        return lunghezzaCoda;
    };
    public void setLunghezzaCoda(double lunghezzaCoda) {
        this.lunghezzaCoda = lunghezzaCoda;
    };
}
