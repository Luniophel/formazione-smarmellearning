package animals.species;

import animals.Animal;

public abstract class Tailed extends Animal {

    private double tailLenght;

    //GETTER & SETTER
    public double getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght(double tailLenght) {
        this.tailLenght = tailLenght;
    }
}
