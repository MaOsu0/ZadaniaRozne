package Zrobione;

public class Apple extends Fruit {
    private String appleType;

    public Apple(double weight, String fruitType, String appleType) {
        super(weight, fruitType);
        this.appleType = appleType;
    }

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", odmiana: " + appleType;
    }

}
