package main.java.factorypattern;

public final class PencilConstants {
    // It's a good practice to keep the constants as final and have a private constructor. Hence we can prevent inheritance and object creation on this class
    // As an alternative, we can make use of Enums as well
    private PencilConstants() {}
    public static final String RED_PENSIL ="redPensil";
    public static final String BLUE_PENSIL = "bluePensil";
}
