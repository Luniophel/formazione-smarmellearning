package animals.utils;

import animals.Animal;
import animals.categories.Tailed;
import animals.categories.Winged;

import java.util.Comparator;
import java.util.List;

public class SearchUtils {

    //SORTING METHODS
    public void sortByHeight(List<? extends Animal> animals){
        animals.sort(Comparator.comparingDouble(Animal::getHeight));
    }

    public void sortByWeight(List<? extends Animal> animals){
        animals.sort(Comparator.comparingDouble(Animal::getWeight));
    }

    public void sortByTailLenght(List<? extends Tailed> animals){
        animals.sort(Comparator.comparingDouble(Tailed::getTailLenght));
    }

    public void sortByWingspan(List<? extends Winged> animals){
        animals.sort(Comparator.comparingDouble(Winged::getWingspan));
    }

    //SEARCHING METHODS
    public Animal[] getTallestAndShortest(List<? extends Animal> animals){
        SearchUtils searchUtils = new SearchUtils();
        searchUtils.sortByHeight(animals);
        System.out.println("Tallest:  " + animals.get(animals.size()-1).getName() + " Height: " + animals.get(animals.size()-1).getHeight());
        System.out.println("Shortest: " + animals.get(0).getName() + " Height: " + animals.get(0).getHeight());
        Animal[] tallestAndShortest = new Animal[]{animals.get(animals.size()-1), animals.get(0)};
        return tallestAndShortest;
    }

    public Animal[] getHeavierAndLighter(List<? extends Animal> animals){
        SearchUtils searchUtils = new SearchUtils();
        searchUtils.sortByWeight(animals);
        System.out.println("Heaviest: " + animals.get(animals.size()-1).getName() + " Weight: " + animals.get(animals.size()-1).getWeight());
        System.out.println("Lighter:  " + animals.get(0).getName() + " Weight: " + animals.get(0).getWeight());
        Animal[] HeavierAndLighter = new Animal[]{animals.get(animals.size()-1), animals.get(0)};
        return HeavierAndLighter;
    }

    public Tailed getLongestTail(List<? extends Tailed> tailedAnimals){
        SearchUtils searchUtils = new SearchUtils();
        searchUtils.sortByTailLenght(tailedAnimals);
        System.out.println("Longest Tail: " + tailedAnimals.get(tailedAnimals.size()-1).getName() + " Tail_Lenght: " + tailedAnimals.get(tailedAnimals.size()-1).getTailLenght());
        return tailedAnimals.get(tailedAnimals.size()-1);
    }

    public Winged getBiggestWingspan(List<? extends Winged> wingedAnimals){
        SearchUtils searchUtils = new SearchUtils();
        searchUtils.sortByWingspan(wingedAnimals);
        System.out.println("Biggest wingspan: " + wingedAnimals.get(wingedAnimals.size()-1).getName() + " Wingspan: " + wingedAnimals.get(wingedAnimals.size()-1).getWingspan());
        return wingedAnimals.get(wingedAnimals.size()-1);
    }
}
