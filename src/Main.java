import animale.Animale;
import animale.specie.Leone;

import java.util.ArrayList;
import java.util.List;
import utils.Ricercatore;

public class Main {

    public static void main(String[] args) {

        Leone leone1 = new Leone();
        leone1.setNome("Alex");
        leone1.setLunghezzaCoda(1.15);
        leone1.setAltezza(1.5);

        Leone leone2 = new Leone();
        leone2.setNome("Lio");
        leone2.setAltezza(1.7);

        Leone leone3 = new Leone();
        leone3.setNome("Purry");
        leone3.setAltezza(1.3);


        System.out.println("Animale più alto:");
        List<Leone> listaLeoni = new ArrayList<Leone>();
        listaLeoni.add(leone1);
        listaLeoni.add(leone2);
        listaLeoni.add(leone3);

        new Ricercatore().trovaPiuAlto(listaLeoni);

        System.out.println(leone1.getNome() + leone1.getLunghezzaCoda());
    }
}
