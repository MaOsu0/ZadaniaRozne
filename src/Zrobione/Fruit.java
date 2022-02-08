package Zrobione;

public class Fruit {
    private double weight;
    private String fruitType;

    public Fruit(double weight, String fruitType) {
        this.weight = weight;
        this.fruitType = fruitType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public String getInfo() {
        return "Weight: " + weight + "g, typ: " + fruitType;
    }
}
