package Zrobione;

public class Test {
    public static void main(String[] args) {


        new Tire(1902,"Michelin","2000",2099,200, 20);
        new Tire(1903,"Bla","2500",133,123, 15);
        ExhaustPart exhaustPart1 = new ExhaustPart(200, "dmad", "dkasd", 12333, true);

        System.out.println(exhaustPart1.getIndex());
    }
}
