package animals.testing;

import animals.Animal;
import animals.categories.Tailed;
import animals.categories.Winged;
import animals.species.Eagle;
import animals.species.Lion;
import animals.species.Tiger;
import animals.utils.SearchUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lion lion1 = new Lion("Alex","Other Animals",8,20,2,0.50);
        Lion lion2 = new Lion("Fred","Other Animals",10,25,1.40,0.30);
        Lion lion3 = new Lion("Purry","Vegetables",2,18,1.60,0.75);
        Eagle eagle1 = new Eagle("Valor", "Rats", 5, 1, 0.4, 1.5);
        Eagle eagle2 = new Eagle("SPID_Flies", "SPID", 99,0.30,0.60, 2.0);
        Eagle eagle3 = new Eagle("Tyre", "Communists", 3,1.00,0.40, 1.70);
        Tiger tiger1 = new Tiger("Roah", "Humans", 4, 22, 1.80, 0.50);

        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(lion1);
        animalsList.add(lion2);
        animalsList.add(lion3);
        animalsList.add(eagle1);
        animalsList.add(tiger1);

        SearchUtils searchUtils = new SearchUtils();

        searchUtils.getTallestAndShortest(animalsList);
        searchUtils.getHeavierAndLighter(animalsList);
        //Poiché restituisce i due oggetti in un array, potrò richiamarli con facilità utilizzando gli indici 0 e 1,
        //oppure creare metodi per facilitarne l'accesso.

        //searchUtils.getLongestTail(animalsList); Ovviamente non posso chiamare il metodo su una lista di Animals.

        List<Tailed> tailedAnimalsList = new ArrayList<>();
        tailedAnimalsList.add(lion1);
        tailedAnimalsList.add(lion2);
        tailedAnimalsList.add(lion3);
        tailedAnimalsList.add(tiger1);

        searchUtils.getLongestTail(tailedAnimalsList);

        List<Winged> wingedAnimalsList = new ArrayList<>();
        wingedAnimalsList.add(eagle1);
        wingedAnimalsList.add(eagle2);
        wingedAnimalsList.add(eagle3);

        searchUtils.getBiggestWingspan(wingedAnimalsList);
    }
}
