package Zrobione;

public class Klasa1 {
    public static final int GLASS = 250;
    public static final int BIG_SPOON = 15;
    public static final int SMALL_SPOON = 5;


    static int glassToMl(int glasses) {
        return glasses * GLASS;
    }

    static int bigSpoonToMl(int bigSpoons) {
        return bigSpoons * BIG_SPOON;
    }

    static int smallSpoonToMl(int smallSpoons) {
        return smallSpoons * SMALL_SPOON;
    }

}
