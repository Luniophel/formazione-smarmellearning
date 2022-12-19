package animals.species;

import animals.Animal;

public abstract class Winged extends Animal {

    private double wingspan;

    //GETTER & SETTER
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
