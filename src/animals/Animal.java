package animals;

import java.time.LocalDate;

public abstract class Animal {

    private String name;
    private String favouriteFood;
    private int age;
    private LocalDate importDate;
    private double weight;
    private double height;

    protected Animal (String name, String favouriteFood, int age, double weight, double height){
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
        this.weight = weight;
        this.height = height;
        importDate = LocalDate.now();
    }

    //GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
