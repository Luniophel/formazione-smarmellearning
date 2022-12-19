package animals.categories;

import animals.Animal;

public abstract class Tailed extends Animal {

    private double tailLenght;

    protected Tailed(String name, String favouriteFood, int age, double weight, double height, double tailLenght) {
        super(name, favouriteFood, age, weight, height);
        this.tailLenght = tailLenght;
    }

    //GETTER & SETTER
    public double getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght(double tailLenght) {
        this.tailLenght = tailLenght;
    }
}
