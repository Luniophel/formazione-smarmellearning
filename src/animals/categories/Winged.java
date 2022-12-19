package animals.categories;

import animals.Animal;

public abstract class Winged extends Animal {

    private double wingspan;

    protected Winged(String name, String favouriteFood, int age, double weight, double height, double wingspan) {
        super(name, favouriteFood, age, weight, height);
        this.wingspan = wingspan;
    }

    //GETTER & SETTER
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
