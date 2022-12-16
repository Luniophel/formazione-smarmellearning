package animale.specie;

import animale.Animale;
import animale.caratteristiche.Caudato;

public class Leone extends Animale implements Caudato {

    private double lunghezzaCoda = 0;

    public double getLunghezzaCoda() {
        return lunghezzaCoda;
    };
    public void setLunghezzaCoda(double lunghezzaCoda) {
        this.lunghezzaCoda = lunghezzaCoda;
    };

}
