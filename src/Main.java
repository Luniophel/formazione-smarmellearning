import animale.Animale;
import animale.caratteristiche.Alato;
import animale.caratteristiche.Caudato;
import animale.specie.Aquila;
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
        leone2.setLunghezzaCoda(1.40);
        leone2.setAltezza(1.7);
        leone2.setPeso(30);

        Leone leone3 = new Leone();
        leone3.setNome("Purry");
        leone3.setLunghezzaCoda(1.45);
        leone3.setAltezza(1.3);
        leone3.setPeso(25);

        Aquila aquila1 = new Aquila();
        aquila1.setNome("Valor");
        aquila1.setAltezza(0.5);
        aquila1.setPeso(1);
        aquila1.setAperturaAlare(2);

//TESTING 1: Lista specie-specifica - Non funziona se inserisco animali diversi dal Leone, necessario migliorare il codice
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


        //TESTING 2: Funziona anche con animali diversi.
        List<Animale> listaAnimali = new ArrayList<>();
        listaAnimali.add(leone1);
        listaAnimali.add(leone2);
        listaAnimali.add(leone3);
        listaAnimali.add(aquila1);

        Animale animaleAperturaMaggiore = listaAnimali.get(0); //Trovare soluzione più decente, questa fa schifo.
        animaleAperturaMaggiore = animaleAperturaMaggiore.trovaAperturaAlareMaggiore(listaAnimali);
            System.out.println("Animale alato con apertura maggiore: " + animaleAperturaMaggiore.getNome() + "\nApertura alare: " + ((Alato)animaleAperturaMaggiore).getAperturaAlare());

        Animale animaleCodaPiuLunga = listaAnimali.get(0); //Trovare soluzione più decente, questa fa schifo.
        animaleCodaPiuLunga = animaleCodaPiuLunga.trovaCodaPiuLunga(listaAnimali);
            System.out.println("Animale caudato con coda più lunga: " + animaleCodaPiuLunga.getNome() + "\nLunghezza coda: " + ((Caudato)animaleCodaPiuLunga).getLunghezzaCoda());

    }
}
