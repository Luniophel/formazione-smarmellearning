import animale.Animale;
import animale.specie.Leone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Leone leone1 = new Leone();
        leone1.setNome("Alex");
        leone1.setLunghezzaCoda(1.15);
        leone1.setAltezza(1.5);
        leone1.setPeso(20);

        Leone leone2 = new Leone();
        leone2.setNome("Lio");
        leone2.setAltezza(1.7);
        leone2.setPeso(30);


        Leone leone3 = new Leone();
        leone3.setNome("Purry");
        leone3.setAltezza(1.3);
        leone3.setPeso(25);


        List<Animale> listaLeoni = new ArrayList<Animale>();
        listaLeoni.add(leone1);
        listaLeoni.add(leone2);
        listaLeoni.add(leone3);

        Leone leonePiuAlto = new Leone();
        leonePiuAlto = (Leone)leonePiuAlto.trovaPiuAlto(listaLeoni);
            System.out.println("Leone più alto:" + leonePiuAlto.getNome() + "\nAltezza:" + leonePiuAlto.getAltezza());


        Leone leonePiuBasso = new Leone();
        leonePiuBasso = (Leone)leonePiuBasso.trovaPiuBasso(listaLeoni);
            System.out.println("Leone più basso:" + leonePiuBasso.getNome() + "\nAltezza:" + leonePiuBasso.getAltezza());


        Leone leonePiuPesante = new Leone();
        leonePiuPesante = (Leone)leonePiuPesante.trovaPiuPesante(listaLeoni);
            System.out.println("Leone più pesante:" + leonePiuPesante.getNome() + "\nPeso:" + leonePiuPesante.getPeso());

        Leone leonePiuLeggero = new Leone();
        leonePiuLeggero = (Leone)leonePiuLeggero.trovaPiuLeggero(listaLeoni);
            System.out.println("Leone più leggero:" + leonePiuLeggero.getNome() + "\nPeso:" + leonePiuLeggero.getPeso());

    }
}
